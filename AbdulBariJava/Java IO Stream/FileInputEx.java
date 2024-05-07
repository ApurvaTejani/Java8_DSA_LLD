import java.io.*;

public class FileInputEx {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(
                    "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/AbdulBariJava/Java IO Stream/Test.txt");
            int av = fis.available();
            System.out.println(av);
            byte b[] = new byte[av];
            fis.read(b);
            String str = new String(b);
            for (byte c : b) {
                System.out.print((char) c);
            }
            System.out.println();
            System.out.println(str);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
