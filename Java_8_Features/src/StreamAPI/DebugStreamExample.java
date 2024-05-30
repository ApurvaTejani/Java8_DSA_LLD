package StreamAPI;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DebugStreamExample {
    static List<Student> studList = StudentDatabase.getAllStudents();
    static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = student -> student.getGpa() >= 3.8;

    public static void main(String[] args) {
        Map<String, List<String>> filteredStudents =
                studList.stream()
                        .peek(System.out::println)
                        .filter(p1)
                        .peek(s -> System.out.println("After 1st filter" + s))
                        .filter(p2)
                        .peek(s -> System.out.println("After 2nd filter" + s))
                        .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println("Final Output " + filteredStudents);
    }
}
