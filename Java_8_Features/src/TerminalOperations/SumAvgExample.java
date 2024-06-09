package TerminalOperations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.summingInt;

public class SumAvgExample {
    static List<Student> studList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {

        //Give me the sum of no of notebooks of Students
        int totalNoteBooks1 = studList.stream()
                .collect(summingInt(Student::getNoOfBooks));

        int totalNoteBook2 = studList.stream()
                .map(Student::getNoOfBooks)
                .reduce(0, (a, b) -> a + b);
        System.out.println("Using Summing Int Method " + totalNoteBooks1);
        System.out.println("Sum of NoteBooks using reduce Method " + totalNoteBook2);

    }
}
