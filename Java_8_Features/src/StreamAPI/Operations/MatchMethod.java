package StreamAPI.Operations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;

public class MatchMethod {

    public static boolean findAnyMethod(List<Student> studList) {
        return studList.stream()
                .anyMatch(s -> s.getGpa() >= 4.6);
    }

    public static boolean findAllMethod(List<Student> studList) {
        return studList.stream()
                .allMatch(s -> s.getGender().equalsIgnoreCase("female"));
    }

    public static boolean noneMatchMethod(List<Student> studList) {
        return studList.stream()
                .noneMatch(s -> s.getGender().equalsIgnoreCase("trans"));
    }

    public static void main(String[] args) {
        List<Student> studList = StudentDatabase.getAllStudents();
        System.out.println("Are there any Student above 4.6 GPA ? " + findAnyMethod(studList));
        System.out.println("Are all students female? " + findAllMethod(studList));
        System.out.println("None match Example " + noneMatchMethod(studList));
    }

}
