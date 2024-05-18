import java.io.*;
//import org.apache.commons.lang3.ArrayUtils;

public class FileClass {
    public static void main(String[] args) {
        File f = new File("C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/Java_8_Features/Java IO Stream");
        System.out.println(f.isDirectory());
        String lister[] = f.list();
        for (String s : lister) {
            System.out.println(s);
        }
        File filelist[] = f.listFiles();
        for (File file : filelist) {
            System.out.print(file.getName() + " ");
            System.out.println(file.getPath());
        }

    }
}
