package TerminalOperations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.*;

public class GroupingByExample_4 {
    static List<Student> studList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {
        //Calculate Top GPA for each grade level - Gives Optional Return Type
        Map<Integer, Optional<Student>> TopGPA = studList.stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(TopGPA);

        // Non Optional Return Type

        Map<Integer, Student> topGPA = studList.stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(topGPA);
    }
}
