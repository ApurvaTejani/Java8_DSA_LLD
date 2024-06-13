package StreamAPI.Optional;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;


import java.util.Optional;

public class OptionalExample_2 {

    public static String getNameUsingOptionalOrElse() {
        Optional<Student> studOp = Optional.ofNullable(StudentDatabase.sup.get());
        String name = studOp.filter(s -> s.getGpa() > 3.5)
                .map(Student::getName).orElse("No Name Found");
        return name;
    }

    public static void main(String[] args) {
        System.out.println(getNameUsingOptionalOrElse());
    }
}
