import java.io.*;

public class FileOutputStreamEx {
    public static void main(String[] args) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(
                "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/AbdulBariJava/Java IO Stream/Test.txt")) {
            String str = "Hello I am writing this on file";
            byte[] b = str.getBytes();
            fos.write(b);
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
