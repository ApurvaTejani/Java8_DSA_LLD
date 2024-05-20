package Java_IO_Stream.Serialisation.Method_2;

import java.io.*;

public class MyWrite {
    public static void main(String[] args) throws Exception {
        try {

            FileOutputStream fos = new FileOutputStream(
                    "C:/Users/apurv/IdeaProjects/Java8_DSA_LLD/src/Java_8_Features/Java IO Stream/Serialisation/Method_2/student2.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            Student s = new Student();
            s.rollno = 10;
            s.name = "Apu";
            s.dept = "EXTC";
            dos.writeInt(s.rollno);
            dos.writeUTF(s.name);
            dos.writeUTF(s.dept);
            dos.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
