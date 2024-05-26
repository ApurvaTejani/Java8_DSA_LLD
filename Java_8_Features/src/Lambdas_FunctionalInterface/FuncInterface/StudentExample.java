package Lambdas_FunctionalInterface.FuncInterface;

import Lambdas_FunctionalInterface.CombinedExample.Consumer_PredicateExample;
import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class StudentExample {
    static Function<List<Student>, Map<String, Double>> func = (s) -> {
        Map<String, Double> name_grade = new HashMap<>();
        s.forEach(stud -> {
            if (Consumer_PredicateExample.p1.test(stud))
                name_grade.put(stud.getName(), stud.getGpa());
        });
        return name_grade;
    };

    public static void main(String[] args) {
        System.out.println(func.apply(StudentDatabase.getAllStudents()));
    }
}
