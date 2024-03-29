import java.util.Arrays;

public class ComparableMain {
    public static void main(String[] args) {
        Student s[] = new Student[5];
        s[0] = new Student(2, 60, "Ajay");
        s[1] = new Student(1, 20, "Sunil");
        s[2] = new Student(3, 30, "Kalu");
        s[3] = new Student(5, 80, "Apu");
        s[4] = new Student(4, 10, "Neeraj");

        Arrays.sort(s);

        for (Student student : s) {
            System.out.println(student);
        }

    }
}
