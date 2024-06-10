package StreamAPI.TerminalOperations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.counting;

public class CountingExample {

    static List<Student> studList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {
        long countofStudents1 = studList.stream()
                .filter(s -> s.getGpa() > 3.9)
                .collect(counting());

        long countofStudents2 = studList.stream()
                .filter(s -> s.getGpa() > 3.9)
                .count();
        System.out.println("Counting using collect " + countofStudents1);
        System.out.println("Count using normal Method " + countofStudents2);
    }
}
