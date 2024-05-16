import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ArrayWriter {
    public static void main(String[] args) throws Exception {
        float fw[] = { 10.6f, 6.5f, 7.8f, 2.3f };
        FileOutputStream fos = new FileOutputStream(
                "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/Java_8_Features/Java IO Stream/Serialisation/Challenge_1/FloatArr.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeFloat(fw.length);
        for (int i = 0; i < fw.length; i++) {
            dos.writeFloat(fw[i]);
        }
    }
}
