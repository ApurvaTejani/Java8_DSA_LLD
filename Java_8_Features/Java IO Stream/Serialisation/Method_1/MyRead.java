package Serialisation.Method_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class MyRead {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader(
                "C:/Users/apurv/OneDrive/AllCodes/Core_java/Udemy+Scaler/src/Java_8_Features/Java IO Stream/Serialisation/Method_1/student.txt");
        BufferedReader br = new BufferedReader(fr);
        Student s = new Student();
        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();
        System.out.println(s.rollno + " " + s.name + " " + s.dept);

    }
}