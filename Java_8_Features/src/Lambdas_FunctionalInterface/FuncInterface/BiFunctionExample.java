package Lambdas_FunctionalInterface.FuncInterface;

import Lambdas_FunctionalInterface.CombinedExample.Consumer_PredicateExample;
import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    static Map<String, Double> name_gpa = new HashMap<>();
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> bifunc = (s, checkgpa) -> {

        s.forEach(stud -> {
            if (checkgpa.test(stud))
                name_gpa.put(stud.getName(), stud.getGpa());
        });
        return name_gpa;
    };

    public static void main(String[] args) {
        System.out.println(bifunc.apply(StudentDatabase.getAllStudents(), Consumer_PredicateExample.p1));
    }
}
