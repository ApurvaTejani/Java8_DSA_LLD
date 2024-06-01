package StreamAPI.Operations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedComparatorExample {
    public static List<Student> sortByStudentName() {
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static Map<String, String> sortedByGPA() {
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toMap(Student::getName, Student::getGender,
                        (existing, replacement) -> existing, LinkedHashMap::new));

    }

    public static void main(String[] args) {
        System.out.println("==========Sorted By Student Name==============");
        sortByStudentName().forEach(System.out::println);
        System.out.println();
        System.out.println("==========Sorted By GPA ==============");
        System.out.println(sortedByGPA());
    }
}
