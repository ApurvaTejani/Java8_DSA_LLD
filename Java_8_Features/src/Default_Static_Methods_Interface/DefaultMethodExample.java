package Default_Static_Methods_Interface;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {
    static List<Student> studList = StudentDatabase.getAllStudents();
    static ArrayList<Student> studentArrayList = new ArrayList<>(studList);
    static Comparator<Student> names = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeLevel = Comparator.comparing(Student::getGradeLevel);


    //Sort the students in Alphabetic order
    public static void sortStudentName(List<Student> studentList) {
        //This Sort Method is Default Method in java 8
        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println("=".repeat(80));
        studentList.forEach(s -> System.out.println(s));
    }


    public static void comparatorChainingExample(List<Student> studentList) {
        //Sort the highest Grade level to the lowest level and if same then sort them on basis of name alphabetic

        studentList.sort(gradeLevel.reversed().thenComparing(names));
        System.out.println("=".repeat(80));
        studentList.forEach(s -> System.out.println(s));
    }

    public static void main(String[] args) {
        System.out.println("=".repeat(80));
        studentArrayList.forEach(s -> System.out.println(s));
        sortStudentName(studentArrayList);
        comparatorChainingExample(studentArrayList);

    }
}
