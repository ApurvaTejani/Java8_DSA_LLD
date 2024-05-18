package Serialisation.Method_1;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class MyWrite {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream(
                "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/Java_8_Features/Java IO Stream/Serialisation/Method_1/student.txt");
        PrintStream ps = new PrintStream(fos);
        Student s = new Student();
        s.rollno = 40;
        s.name = "Apu";
        s.dept = "EXTC";
        ps.println(s.rollno);
        ps.println(s.name);
        ps.print(s.dept);

    }
}
