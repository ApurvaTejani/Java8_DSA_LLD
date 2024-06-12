package Lambdas_FunctionalInterface.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> sup = () -> {
        return new Student("Apurva", 2, 3.6, "male", Arrays.asList("Swimming", "Gymming", "Cricket"),
                11);
//        return null;
    };

    public static List<Student> getAllStudents() {
        Student s1 = new Student("Apurva", 2, 3.6, "Male", Arrays.asList("Swimming", "Cricket"), 11);
        Student s2 = new Student("Harish", 2, 3.8, "Male", Arrays.asList("Cycling", "Gymming"), 13);
        Student s3 = new Student("Varun", 3, 4.0, "Male", Arrays.asList("Swimming", "Aerobics", "Badminton"), 21);
        Student s4 = new Student("Mia", 3, 3.9, "Female", Arrays.asList("Gymming", "Cricket"), 25);
        Student s5 = new Student("Abdul", 4, 3.5, "Male", Arrays.asList("Swimming", "Riding", "Gymming"), 32);
        Student s6 = new Student("Neha", 4, 3.9, "Female", Arrays.asList("Gymming", "Handball", "Cricket"), 29);
        Student s7 = new Student("RamScholar", 4, 4.5, "Male", Arrays.asList("Studying", "Coding", "Chess"), 46);
        List<Student> allStudents = List.of(s1, s2, s3, s4, s5, s6, s7);
        return allStudents;
    }
}
