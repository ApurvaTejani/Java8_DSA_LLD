package StreamAPI.TerminalOperations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

public class PartitioningByExample {
    static List<Student> studList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {
        Map<Boolean, List<Student>> filteredStud = studList.stream()
                .collect(partitioningBy(s -> s.getGpa() >= 3.8));
        System.out.println(filteredStud);
    }

}
