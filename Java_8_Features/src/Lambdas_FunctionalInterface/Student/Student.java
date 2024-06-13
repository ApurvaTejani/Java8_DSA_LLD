package Lambdas_FunctionalInterface.Student;

import StreamAPI.Optional.Bike;

import java.util.List;
import java.util.Optional;
;

public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private List<String> activities;

    private Optional<Bike> bk = Optional.empty();

    public Optional<Bike> getBk() {
        return bk;
    }

    public void setBk(Optional<Bike> bk) {
        this.bk = bk;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", gpa=" + gpa +
                ", gender='" + gender + '\'' +
                ", activities=" + activities +
                ", noOfBooks=" + noOfBooks +
                '}';
    }

    private int noOfBooks;

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int noOfBooks, Optional<Bike> bk) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.noOfBooks = noOfBooks;
        this.bk = bk;
    }

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities, int noOfBooks) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
        this.noOfBooks = noOfBooks;

    }

    public Student() {

    }

    public Student(String s) {
        this.name = s;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void printActivities() {
        System.out.println(activities);
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

}
