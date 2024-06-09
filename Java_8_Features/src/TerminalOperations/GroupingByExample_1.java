package TerminalOperations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class GroupingByExample_1 {
    static List<Student> studList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {
        // Give me List of Student for each Gender - One Param
        Map<String, List<Student>> genderMapStud = studList.stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(genderMapStud);

        System.out.println("-".repeat(60));
        //Custom Grouping - One Param
        Map<String, List<Student>> customGrp =
                studList.stream()
                        .collect(groupingBy(s -> s.getGpa() > 3.8 ? "Scholar Student" : "Average Student"));

        System.out.println(customGrp);
    }
}
