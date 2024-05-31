package StreamAPI.Operations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static List<Student> studList = StudentDatabase.getAllStudents();

    public static List<String> studActivities() {
        return studList.stream()
                .map(s -> s.getActivities())
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> activities = studActivities();
        System.out.println(activities);
    }
}
