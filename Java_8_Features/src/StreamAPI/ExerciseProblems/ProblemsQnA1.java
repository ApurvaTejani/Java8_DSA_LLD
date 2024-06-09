package StreamAPI.ExerciseProblems;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

//Q1 Find the average GPA of female students who are in grade level 3 or higher.
//Q2  Retrieve a sorted list of names of all students who are involved in more than two activities.
// Q3  Group students by gender and find the student with the highest GPA in each group.
//Q4 Create a comma-separated string of the names of students who have read at least 26 books and have a GPA of 3.0 or higher.
public class ProblemsQnA1 {
    static List<Student> studList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {

        // Solution to Q1
        List<Student> filteredStudents = studList.stream()
                .filter(s -> s.getGender().equalsIgnoreCase("female"))
                .filter(s -> s.getGradeLevel() >= 3)
                .collect(Collectors.toList());

        Double sum = filteredStudents.stream()
                .mapToDouble(Student::getGpa).sum();

        System.out.println("Sum is " + sum);
        long count = filteredStudents.size();
        System.out.println("Count is " + count);
        System.out.println("Q1 Find the average GPA of female students who are in grade level 3 or higher.");
        System.out.println("Average is equal to " + sum / count);


        //Solution to Q2
        List<String> filteredList1 = studList.stream()
                .filter(s -> s.getActivities().size() > 2)
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Q2  Retrieve a sorted list of names of all students who are involved in more than two activities.");
        System.out.println(filteredList1);

        //Solution to Q3

        Map<String, Optional<Student>> highestGPA =
                studList.stream()
                        .collect(groupingBy(Student::getGender,
                                maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println("Q3  Group students by gender and find the student with the highest GPA in each group.");
        System.out.println(highestGPA);

        //Solution to Q4

        String str =
                studList.stream()
                        .filter(s -> s.getNoOfBooks() >= 26)
                        .filter(s -> s.getGpa() >= 3.9)
                        .map(Student::getName)
                        .collect(joining(","));
        System.out.println("Q4 Create a comma-separated string of the names of students who have read at least 26 books and have a GPA of 3.0 or higher.");
        System.out.println(str);
    }
}
