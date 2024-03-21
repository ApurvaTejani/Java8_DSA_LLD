package Scaler_Exercise;

public class StudentNew {
    // write the code of student class here
    private int age;
    private String name;

    public void display() {
        System.out.println("My name is " + name + ". I am " + age + " years old");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(String name) {
        System.out.println(name + " says hello to " + name);
    }
}
