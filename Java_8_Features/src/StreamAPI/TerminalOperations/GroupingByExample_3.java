package StreamAPI.TerminalOperations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class GroupingByExample_3 {
    static List<Student> studList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {
        //Three Param Example
        // First Param as an Input-Key
        //Second Param as a Output Supplier
        // Third one as the value of that key
        LinkedHashMap<String, Set<Student>> threeParamMap =
                studList.stream()
                        .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(threeParamMap);

    }
}
