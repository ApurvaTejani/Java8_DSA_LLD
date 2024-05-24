package Lambdas_FunctionalInterface.ConsumerExample;


import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerDemo {

    // Before Java-8
    static Consumer<Student> c1 = new Consumer<Student>() {
        @Override
        public void accept(Student s) {
            System.out.print(s.getName() + " ");
        }
    };
    // Using java 8 feature
    //    static Consumer<Student> c1 = (s) -> System.out.print(s.getName() + " ");
    static Consumer<Student> c2 = (s) -> System.out.println(s.getActivities());

    static Consumer<Student> c3 = (s) -> System.out.print(s.getGradeLevel() + " ");

    static BiConsumer<String, Double> bc = (name, gpa) -> System.out.println(name + " has gpa of" + gpa);
    static List<Student> studlist = StudentDatabase.getAllStudents();

    static void printName() {
        // Before Java-8
        for (Student s : studlist) {
            c1.accept(s);
        }
        // Using java 8 feature
//        studlist.forEach(c1);
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

    static void printNameWithGPA() {
        studlist.forEach(s -> bc.accept(s.getName(), s.getGpa()));
    }

    public static void main(String[] args) {
        printName();
        System.out.println();
        printActivities();
        System.out.println("Activities with Grade 3");
        printActivitiesWithGrade3();
        System.out.println();
        printNameWithGPA();
    }
}
