package S9_DesginPatterns.FlyWeightDesignPattern;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) throws IOException {
        //startUp Code
        HashMap<String, PlayerFlyWeight> register = new HashMap<>();
        Image dumbPlayerAvatar = ImageIO.read(new File("C:\\Users\\apurv\\Downloads\\DumbPlayer.png"));
        register.put("DumbPlayer", new PlayerFlyWeight(10, 10, dumbPlayerAvatar));
        register.put("Bomber", new PlayerFlyWeight(50, 50, dumbPlayerAvatar));
        register.put("Tanker", new PlayerFlyWeight(100, 100, dumbPlayerAvatar));
        register.put("Machine", new PlayerFlyWeight(1000, 1000, dumbPlayerAvatar));
        Player[] players = new Player[60000];
        Point p = new Point(2, 4, 5);

        // Measure memory usage before creating objects
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory before creating objects: " + bytesToMegabytes(memoryBefore) + " MB");

        // with use of register and flyweight creating 60k player consumes less memory
//        for (int i = 0; i < 60000; i++) {
//            players[i] = new Player(p, 100, 540, 4, register.get("DumbPlayer"));
//        }

        // Without Flyweight, you will create 60k player consumes more as 60k image objects are created
        for (int i = 0; i < 60000; i++) {
            players[i] = new Player(p, 100, 540, 4, new PlayerFlyWeight(10, 10, dumbPlayerAvatar));
        }
        // Measure memory usage after creating objects
        runtime.gc(); // Suggesting the JVM to run garbage collection
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory after creating objects: " + bytesToMegabytes(memoryAfter) + " MB");

        // Calculate memory used
        long memoryUsed = memoryAfter - memoryBefore;
        System.out.println("Memory used by 9000 Player objects: " + bytesToMegabytes(memoryUsed) + " MB");

    }

    public static double bytesToMegabytes(long bytes) {
        return bytes / (1024.0 * 1024.0);
    }


}
