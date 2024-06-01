package StreamAPI.Operations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.Optional;

public class ReduceStudentExample {

    public static Optional<Student> getHighestGPA() {
        return StudentDatabase.getAllStudents().stream()
                .reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        if (getHighestGPA().isPresent()) {

            System.out.println(getHighestGPA().get());
        }
    }
}
