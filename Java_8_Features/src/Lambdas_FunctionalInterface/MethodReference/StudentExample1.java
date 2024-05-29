package Lambdas_FunctionalInterface.MethodReference;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class StudentExample1 {
    static Consumer<Student> c1 = System.out::println;

    static Consumer<Student> c2 = Student::printActivities;
    static List<Student> studList = StudentDatabase.getAllStudents();

    public static void main(String[] args) {
        studList.forEach(c1);
        studList.forEach(c2);
    }
}
