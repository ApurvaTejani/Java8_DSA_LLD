package TerminalOperations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class MappingExample {
    static List<Student> studList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {

        // mapping using collect Method
        List<String> name1 = studList.stream()
                .collect(mapping(Student::getName, toList()));

        // Earlier way 1 of map method
        List<String> name2 = studList.stream()
                .map(Student::getName)
                .collect(toList());


        System.out.println("Using Mapping using collect Method " + name1);
        System.out.println("Using Map Method  " + name2);
    }
}
