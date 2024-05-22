package Lambdas_FunctionalInterface.StudentExample;


import java.text.CompactNumberFormat;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    static Consumer<Student> c1 = (s) -> System.out.print(s.getName() + " ");
    static Consumer<Student> c2 = (s) -> System.out.println(s.getActivities());

    static Consumer<Student> c3 = (s) -> System.out.print(s.getGradeLevel() + " ");
    static List<Student> studlist = StudentDatabase.getAllStudents();

    static void printName() {
        studlist.forEach(c1);
    }

    static void printActivities() {
        studlist.forEach(c1.andThen(c2));
    }

    static void printActivitiesWithGrade3() {
        studlist.forEach((s) -> {
            if (s.getGradeLevel() == 3)
                c1.andThen(c3).andThen(c2).accept(s);
        });
    }


    public static void main(String[] args) {
//        printName();
        printActivities();
        System.out.println("Activities with Grade 3");
        printActivitiesWithGrade3();
    }
}
