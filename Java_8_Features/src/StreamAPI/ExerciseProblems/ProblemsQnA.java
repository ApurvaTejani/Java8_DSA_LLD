package StreamAPI.ExerciseProblems;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.groupingBy;

//Q1 Find the average GPA of female students who are in grade level 3 or higher.
//Q2  Retrieve a sorted list of names of all students who are involved in more than two activities.
//   Group students by gender and find the student with the highest GPA in each group.
// Create a comma-separated string of the names of students who have read at least 5 books and have a GPA of 3.0 or higher.
public class ProblemsQnA {
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


    }
}
