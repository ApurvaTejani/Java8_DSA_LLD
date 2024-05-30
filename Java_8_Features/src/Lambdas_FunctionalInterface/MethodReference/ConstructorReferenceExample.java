package Lambdas_FunctionalInterface.MethodReference;

import Lambdas_FunctionalInterface.Student.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    static Supplier<Student> ss = Student::new;
    static Function<String, Student> fnc = Student::new;

    public static void main(String[] args) {
        System.out.println(ss.get());
        System.out.println(fnc.apply("Apurva"));
    }
}
