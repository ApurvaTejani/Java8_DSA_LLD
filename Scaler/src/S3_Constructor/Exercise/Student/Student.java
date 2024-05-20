package S3_Constructor.Exercise.Student;
public class Student {
    int age;
    String name;

    public Student() {
        // this.age=0;
        // this.name= null;
        this(0, null);
    }

    public Student(int age) {
        // this.age=age;
        // this.name= null;
        this(age, null);
    }

    public Student(String name) {
        // this.age=0;
        // this.name= name;
        this(0, name);
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
