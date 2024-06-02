package StreamAPI.Operations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;
import java.util.Optional;

public class FindMathods {

    public static Optional<Student> getFirstStudent_MoreThanGPA4(List<Student> studList) {
        return studList.stream()
                .filter(s -> s.getGpa() >= 4.0)
                .findAny();
    }

    //findFirst() method is also same as the above

    public static void main(String[] args) {
        List<Student> studList = StudentDatabase.getAllStudents();
        System.out.println("Get First Student who has GPA more than equal to 4 " + getFirstStudent_MoreThanGPA4(studList));
    }
}
