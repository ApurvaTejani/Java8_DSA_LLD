package StreamAPI.Operations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static List<Student> studList = StudentDatabase.getAllStudents();

    public static List<String> studNames() {
        return studList.stream()
                .map(s -> s.getName())
                .collect(Collectors.toList());


    }

    public static void main(String[] args) {
        List<String> name = studNames();
        System.out.println(name);
    }
}
