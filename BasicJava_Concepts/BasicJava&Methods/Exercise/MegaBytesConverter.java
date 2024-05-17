
public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0)
            System.out.println("Invalid Value");
        else if (kiloBytes >= 0) {
            int MegaByte = kiloBytes / 1024;
            int remainingKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + MegaByte + " MB and " + remainingKB + " KB");
        }
    }
}
