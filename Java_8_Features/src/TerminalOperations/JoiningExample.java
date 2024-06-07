package TerminalOperations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {

    static List<Student> studList = StudentDatabase.getAllStudents();

    public static String getAllNames(List<Student> studList) {
        return studList.stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String getNamesWithDelimiter(List<Student> studList) {
        return studList.stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static String getNamesWithPrefixAndSuffixAndDelimiter(List<Student> studList) {
        return studList.stream()
                .map(Student::getName)
                .collect(Collectors.joining("-", "[", "]"));
    }

    public static void main(String[] args) {

        System.out.println(getAllNames(studList));
        System.out.println(getNamesWithDelimiter(studList));
        System.out.println(getNamesWithPrefixAndSuffixAndDelimiter(studList));
    }

}
