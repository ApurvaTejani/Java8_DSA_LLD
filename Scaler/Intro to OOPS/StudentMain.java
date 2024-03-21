package Scaler_Exercise;

public class StudentMain {
    public static void main(String[] args) {
        // int age = 10;
        // String name = "Apurva";
        // System.out.println(age + " " + name);
        StudentNew s = new StudentNew();
        s.setAge(26);
        s.setName("Apurva");
        s.display();
        s.sayHello("Rajesh");
    }
}
