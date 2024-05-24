package Lambdas_FunctionalInterface.Student;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
    public static List<Student> getAllStudents() {
        Student s1 = new Student("Apurva", 2, 3.6, "male", Arrays.asList("Swimming", "Gymming", "Cricket"));
        Student s2 = new Student("Harish", 2, 3.8, "male", Arrays.asList("Cycling", "Gymming", "Swimming"));
        Student s3 = new Student("Varun", 3, 4.0, "male", Arrays.asList("Swimming", "Aerobics", "Badminton"));
        Student s4 = new Student("Mia", 3, 3.9, "Female", Arrays.asList("Swimming", "Gymming", "Cricket"));
        Student s5 = new Student("Abdul", 4, 3.5, "male", Arrays.asList("Swimming", "Riding", "Gymming"));
        Student s6 = new Student("Neha", 4, 3.9, "Female", Arrays.asList("Gymming", "Handball", "Cricket"));
        Student s7 = new Student("RamScholar", 4, 4.5, "Male", Arrays.asList("Studying", "Coding", "Chess"));
        List<Student> allStudents = List.of(s1, s2, s3, s4, s5, s6, s7);
        return allStudents;
    }
}
