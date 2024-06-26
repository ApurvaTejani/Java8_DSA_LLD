package S9_DesginPatterns.ProtoType_Student;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        Student s2 = getStudent(s1);
        System.out.println(s1+" "+s2);
        Student ms1 = new MeritStudent();
        Student ms2 = getStudent(ms1);
        System.out.println(ms1+" "+ms2);
    }

    public static Student getStudent(Student s) {
        return s.clone();
    }
}
