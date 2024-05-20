package Java_IO_Stream.DestinationCap;

import java.io.*;

public class FileInput {

        public static void main(String[] args) {
                System.out.println(System.getProperty("user.dir"));
                try {

                        FileInputStream fis1 = new FileInputStream(
                                        "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/AbdulBariJava/Java IO Stream/DestinationCap/Source1.txt");
                        FileInputStream fis2 = new FileInputStream(
                                        "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/AbdulBariJava/Java IO Stream/DestinationCap/Source2.txt");
                        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

                        FileOutputStream fos = new FileOutputStream(
                                        "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/AbdulBariJava/Java IO Stream/DestinationCap/Destination.txt");
                        byte[] buffer = new byte[fis1.available() + fis2.available()];
                        int bytesRead;
                        while (true) {
                                bytesRead = sis.read(buffer);
                                // System.out.println(bytesRead);
                                if (bytesRead == -1)
                                        break; // Exit the loop if no more bytes are read
                                fos.write(buffer, 0, bytesRead);
                        }

                } catch (Exception e) {
                        System.out.println(e);
                }
        }

        public static SequenceInputStream getSequenceInputStream() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'getSequenceInputStream'");
        }

}
