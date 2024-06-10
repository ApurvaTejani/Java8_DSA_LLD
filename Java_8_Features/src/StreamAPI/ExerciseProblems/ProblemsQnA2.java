package StreamAPI.ExerciseProblems;
// Q5 Count the number of students in each grade level who have a GPA above the average GPA of all students.
//  Q6 Find the first student who has a GPA greater than 3.7 and is involved in at least one activity.
// Q7 Partition students into those who have a GPA of 3.5 or higher and those who do not, then sort each group by the number of books read.
//   Q8  Get a distinct list of activities that students with a GPA below 3.9 are involved in.

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.Map;


import static java.util.stream.Collectors.*;

public class ProblemsQnA2 {
    static List<Student> studList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {
        System.out.println("=".repeat(90));
        // Soln to Q5
        Double avg = studList.stream()
                .mapToDouble(Student::getGpa)
                .average().getAsDouble();

        Map<Double, Long> filteredStud =
                studList.stream()
                        .filter(s -> s.getGpa() > avg)
                        .collect(groupingBy(Student::getGpa, counting()));
        System.out.println(filteredStud);
        System.out.println("=".repeat(90));
        //Soln to Q6

        Student s1 = studList.stream()
                .filter(s -> s.getGpa() > 3.7)
                .filter(s -> s.getActivities().size() >= 1)
                .findFirst().get();
        System.out.println(s1);
        System.out.println("=".repeat(90));
// Soln to Q7
        List<Student> fileredStud1 =
                studList.stream()
                        .sorted(Comparator.comparing(Student::getNoOfBooks))
                        .collect(toList());
        Map<Boolean, List<Student>> mapfilter = fileredStud1.stream()
                .collect(partitioningBy(s -> s.getGpa() > 3.8));

        System.out.println(mapfilter);


        System.out.println(fileredStud1);

        System.out.println("=".repeat(90));
        //Soln to Q8
        List<String> activities =
                studList.stream()
                        .filter(s -> s.getGpa() < 3.9)
                        .map(Student::getActivities)
                        .flatMap(List::stream)
                        .distinct()
                        .collect(toList());
        System.out.println(activities);
    }
}
