package Lambdas_FunctionalInterface.Sub_FunctionalInterface;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class BinaryExample {
    static BinaryOperator<String> biOp = (name, gender) -> name.concat(" = ").concat(gender).toUpperCase();
    static Consumer<Student> c1 = (s) -> System.out.println(biOp.apply(s.getName(), s.getGender()));
    static List<Student> studList = StudentDatabase.getAllStudents();


    public static void main(String[] args) {
        studList.forEach(c1);
    }
}
