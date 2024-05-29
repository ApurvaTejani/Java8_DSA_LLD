package Lambdas_FunctionalInterface.MethodReference;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodRefRefractorExample {
    static Predicate<Student> p1 = MethodRefRefractorExample::getStudentHavingGradeMoreThan3;

    public static boolean getStudentHavingGradeMoreThan3(Student s) {
        return s.getGradeLevel() > 3;
    }


    public static void main(String[] args) {
        System.out.println(p1.test((StudentDatabase.sup.get())));
    }

}
