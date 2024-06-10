package StreamAPI.ParallelStream;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStudentExample {

    public static List<String> getNamesUsingSequentialStream(List<Student> studList) {
        long start = System.currentTimeMillis();
        List<String> activities = studList.stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Time taken by single stream " + (end - start));
        return activities;
    }

    public static List<String> getNamesUsingParallelStream(List<Student> studList) {
        long start = System.currentTimeMillis();
        List<String> activities = studList.stream().parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Time taken by parallel stream " + (end - start));
        return activities;
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudents();
        getNamesUsingSequentialStream(studentList);
        getNamesUsingParallelStream(studentList);
    }
}
