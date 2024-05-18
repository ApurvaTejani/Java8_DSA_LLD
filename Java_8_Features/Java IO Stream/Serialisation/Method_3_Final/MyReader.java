package Serialisation.Method_3_Final;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MyReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(
                "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/Java_8_Features/Java IO Stream/Serialisation/Method_3_Final/student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s;
        s = (Student) ois.readObject();
        System.out.println(s);
    }
}
