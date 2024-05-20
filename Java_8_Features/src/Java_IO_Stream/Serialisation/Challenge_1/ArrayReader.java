package Java_IO_Stream.Serialisation.Challenge_1;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ArrayReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(
                "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/Java_8_Features/Java IO Stream/Serialisation/Challenge_1/FloatArr.txt");
        DataInputStream dis = new DataInputStream(fis);
        int length = (int) dis.readFloat();
        float[] fr = new float[length];
        for (int i = 0; i < fr.length; i++) {
            fr[i] = dis.readFloat();
            System.out.println(fr[i]);
        }
    }
}
