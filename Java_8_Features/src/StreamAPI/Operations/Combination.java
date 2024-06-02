package StreamAPI.Operations;

import Lambdas_FunctionalInterface.Student.Student;
import Lambdas_FunctionalInterface.Student.StudentDatabase;

import java.util.List;

public class Combination {
    public static int getNoOfBooksOfFemaleStudents_moreThan3Grade(List<Student> studList) {
        return studList.stream()
                .filter(s -> s.getGradeLevel() > 3)
                .filter(s -> s.getGender().equalsIgnoreCase("female"))
                .map(Student::getNoOfBooks) //s -> s.getNoOfBooks())
                .reduce(0, Integer::sum);//(a,b)->a+b
    }

    public static void main(String[] args) {
        int result = getNoOfBooksOfFemaleStudents_moreThan3Grade(StudentDatabase.getAllStudents());
        System.out.println(result);
    }
}
