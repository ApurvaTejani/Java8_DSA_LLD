package StreamAPI.Optional;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.Optional;

public class OptionalExample_3 {

    public static String getBikeName() {
        Optional<Student> studOp = Optional.ofNullable(StudentDatabase.sup.get());
        String bikeName = studOp.flatMap(Student::getBk)
                .map(Bike::getName).orElse("Bike not found");
        return bikeName;
    }

    public static void main(String[] args) {
        System.out.println(getBikeName());
    }
}
