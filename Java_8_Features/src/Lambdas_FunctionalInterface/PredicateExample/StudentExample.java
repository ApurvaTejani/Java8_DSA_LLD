package Lambdas_FunctionalInterface.PredicateExample;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class StudentExample {
    static Predicate<Student> p1 = (s) -> s.getGradeLevel() > 3;
    static Predicate<Student> p2 = (s) -> s.getGender().equals("Female");
    static List<Student> studList = StudentDatabase.getAllStudents();

    public static void studentWithMoreThanGrade3() {
        studList.forEach((s) -> {
            if (p1.test(s))
                System.out.println(s);
        });
    }

    public static void femaleStudentWithMoreThanGrade3() {
        studList.forEach(s -> {
            if (p1.and(p2).test(s))
                System.out.println(s);
        });
    }

    // Trying to write this using before java 8 method
    public static void femaleStudentWithMoreThanGrade3OldWay() {
        for (int i = 0; i < studList.size(); i++) {
            if (studList.get(i).getGender().equals("Female") && studList.get(i).getGradeLevel() > 3)
                System.out.println(studList.get(i));
        }
    }

    public static void main(String[] args) {
        studentWithMoreThanGrade3();
        femaleStudentWithMoreThanGrade3();
        femaleStudentWithMoreThanGrade3OldWay();
    }
}
