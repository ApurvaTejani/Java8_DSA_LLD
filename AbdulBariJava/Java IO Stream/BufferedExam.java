import java.io.*;

public class BufferedExam {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(
                "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/AbdulBariJava/Java IO Stream/Imput.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        System.out.println(fis.markSupported());
        System.out.println(bis.markSupported());

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        bis.mark(3);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());

        bis.reset();

        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
    }
}
