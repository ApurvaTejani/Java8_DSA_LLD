package StreamAPI.Operations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Distinct_SortedExample {
    public static List<String> sortedUniqueActivitiesByStudents() {
        return StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(sortedUniqueActivitiesByStudents());
        sortedUniqueActivitiesByStudents().forEach(System.out::println);
    }
}
