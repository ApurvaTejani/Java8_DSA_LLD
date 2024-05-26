package Lambdas_FunctionalInterface.CombinedExample;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Consumer_PredicateExample {
    public static Predicate<Student> p1 = s -> s.getGpa() > 3.8;
    Predicate<Student> p2 = s -> s.getGradeLevel() > 3;
    BiConsumer<String, List<String>> bc = (name, activities) -> System.out.println(name + " does " + activities);

    BiPredicate<List<String>, String> bp = (activity, gender) -> activity.contains("Coding") && gender.equals("Male");

    Consumer<Student> c1 = s -> {
        if (bp.test(s.getActivities(), s.getGender()) && p1.and(p2).test(s))
            bc.accept(s.getName(), s.getActivities());
    };

    public void printNameAndActivity(List<Student> studList) {
        studList.forEach(c1);
    }

    public static void main(String[] args) {
        List<Student> studList = StudentDatabase.getAllStudents();
        // Give me a Male Student Who does Coding and has gpa above 3.8 and Grade above 3
        new Consumer_PredicateExample().printNameAndActivity(studList);
    }
}
