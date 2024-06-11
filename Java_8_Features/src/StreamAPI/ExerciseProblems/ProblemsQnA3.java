package StreamAPI.ExerciseProblems;

//Q9 Verify that all students in grade level 4 have read more than 30 books and find the total number of books read by these students.
// Q10 Find any student who is involved in "Gymming" and has a GPA of at least 3.8, and return their name.

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summingInt;

public class ProblemsQnA3 {
    static List<Student> studList = StudentDatabase.getAllStudents();


    public static void main(String[] args) {
        System.out.println("=".repeat(90));
        int sum = studList.stream()
                .filter(s -> s.getGradeLevel() == 4)
                .filter(s -> s.getNoOfBooks() > 30)
//        .map(Student::getNoOfBooks)
                .collect(summingInt(Student::getNoOfBooks));
        System.out.println("Total no of Books of students in grade level 4 have read more than 30 books " + sum);
        System.out.println("=".repeat(90));
        List<String> fileredNames =
                studList.stream()
                        .filter(s -> s.getActivities().contains("Gymming"))
                        .filter(s -> s.getGpa() >= 3.8)
                        .map(Student::getName)
                        .collect(Collectors.toList());
        System.out.println(fileredNames);

    }
}
