package StreamAPI.TerminalOperations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.minBy;

public class MaxByMinBYExample {
    static List<Student> studList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {
        //Give me the Students having lowest GPA
        Optional<Student> minimumGPA1 = studList.stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));

        Optional<Student> minimumGPA2 = studList.stream()
                .reduce((s1, s2) -> s1.getGpa() < s2.getGpa() ? s1 : s2);


        System.out.println("Using minBy GPA of Students using Collect Method " + minimumGPA1);
        System.out.println("Minimum GPA of Student using reduce Method " + minimumGPA2);

    }

}
