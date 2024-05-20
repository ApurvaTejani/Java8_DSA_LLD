package Java_IO_Stream.BufferedArrayEg;

import java.io.*;

public class ByteIOExam {
    public static void main(String[] args) throws Exception {
        byte[] b = { 'a', 'b', 'c', 'd', 'e' };
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        int x;
        while ((x = bis.read()) != -1) {
            System.out.print((char) x);
        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('a');
        bos.write('b');
        bos.write('c');

        bos.writeTo(
                new FileOutputStream(
                        "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/AbdulBariJava/Java IO Stream/ByetArrayEg.txt"));

    }
}
