import java.io.FileOutputStream;
import java.io.SequenceInputStream;

import javax.sound.midi.Sequence;

public class FileOuputDestination {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(
                    "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/AbdulBariJava/Java IO Stream/DestinationCap/Destination.txt");

            SequenceInputStream sis = FileInput.getSequenceInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead;
            while (true) {
                bytesRead = sis.read(buffer);
                System.out.println(bytesRead);
                if (bytesRead == -1)
                    break; // Exit the loop if no more bytes are read
                fos.write(buffer, 0, bytesRead);
            }
        } catch (Exception e) {

        }

    }
}
