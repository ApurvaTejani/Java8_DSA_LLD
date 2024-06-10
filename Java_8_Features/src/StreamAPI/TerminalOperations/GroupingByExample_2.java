package StreamAPI.TerminalOperations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class GroupingByExample_2 {
    static List<Student> studList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {
        //Two layers of Grouping
        //Two Params of groupingBy
        //Give me No of Books For Each Gender Male and Female  which they have
        Map<String, Integer> GenderMapBooks = studList.stream()
                .collect(groupingBy(Student::getGender, summingInt(Student::getNoOfBooks)));
        System.out.println("No of Books each Gender i.e Male Female Holds : " + GenderMapBooks);

        Map<Integer, Map<String, List<Student>>> doubleMap =
                studList.stream()
                        .collect(groupingBy(Student::getGradeLevel, groupingBy(s -> s.getGpa() > 3.8 ? "Smart" : "Average")));

        System.out.println(doubleMap);


    }
}
