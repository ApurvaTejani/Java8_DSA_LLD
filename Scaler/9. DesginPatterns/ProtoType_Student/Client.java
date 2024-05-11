public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);
        Student s2 = getStudent(s1);
        System.out.println(s2);
        Student ms1 = new MeritStudent();
        Student ms2 = getStudent(ms1);
    }

    public static Student getStudent(Student s) {
        return s.clone();
    }
}
