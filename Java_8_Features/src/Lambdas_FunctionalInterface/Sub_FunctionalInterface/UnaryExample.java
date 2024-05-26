package Lambdas_FunctionalInterface.Sub_FunctionalInterface;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class UnaryExample {
    static UnaryOperator<List<String>> unOp = (activity) -> {
        List<String> filteredActivity = new ArrayList<>();
        for (int i = 0; i < activity.size(); i++) {
            if (activity.get(i).equals("Gymming"))
                filteredActivity.add(activity.get(i));
        }
        return filteredActivity;
    };
    static List<Student> studList = StudentDatabase.getAllStudents();
    static Consumer<Student> c1 = (s) -> System.out.println(unOp.apply(s.getActivities()));

    public static void main(String[] args) {
        studList.forEach(c1);
    }
}
