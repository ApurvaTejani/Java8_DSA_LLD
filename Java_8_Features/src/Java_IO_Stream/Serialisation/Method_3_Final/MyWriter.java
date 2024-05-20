package Java_IO_Stream.Serialisation.Method_3_Final;
import java.io.*;

public class MyWriter {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream(
                "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/Java_8_Features/Java IO Stream/Serialisation/Method_3_Final/student3.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student s = new Student(20, "Apu", "EXTC");
        oos.writeObject(s);

    }
}
