package Java_IO_Stream.Serialisation.Method_3_Final;

import java.io.Serializable;

public class Student implements Serializable {
    int rollno;
    String name;
    String dept;

    static String schoolName = "CA";

    public Student() {
    }

    public Student(int rollno, String name, String dept) {
        this.rollno = rollno;
        this.name = name;
        this.dept = dept;
        schoolName = "Bharti";
    }

    public String toString() {
        return rollno + " " + name + " " + dept + " " + schoolName;
    }
}
