package StreamAPI.Optional;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExample_1 {
    public static Optional<String> getStudentNameUsingOptional() {

        Optional<Student> studentOp = Optional.ofNullable(StudentDatabase.sup.get());

        if (studentOp.isPresent()) {
            return studentOp.map(Student::getName);
        } else
            return Optional.empty();
    }

    public static String getStudentNameUNormalWay() {

        Student student = StudentDatabase.sup.get();

        if (student == null) {
            return null;
        } else
            return student.getName();
    }

    public static void main(String[] args) {

        //Optional Way
        System.out.println("=== Optional Way====");
        Optional<String> name = getStudentNameUsingOptional();
        if (name.isPresent())
            System.out.println(name.get().length());
        else
            System.out.println("No name Found");

        //Normal Way
        System.out.println("=== Normal Way ====");
        String name1 = getStudentNameUNormalWay();
        if (name1 == null) {
            System.out.println("No name found");

        } else
            System.out.println(name1.length());
    }
}
