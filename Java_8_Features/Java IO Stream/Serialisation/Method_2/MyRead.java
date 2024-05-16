import java.io.*;

public class MyRead {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(
                "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/Java_8_Features/Java IO Stream/Serialisation/Method_2/student2.txt");
        DataInputStream dis = new DataInputStream(fis);
        Student s = new Student();
        s.rollno = dis.readInt();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();
        System.out.println(s.rollno + " " + s.name + " " + s.dept);
    }
}
