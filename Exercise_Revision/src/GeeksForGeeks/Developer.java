package GeeksForGeeks;

public class Developer extends Employee {
    private int durationOfWork;

    public static void funStatic() {
        System.out.println("In Child  Class - Developer");
    }

    public void fun() {
        super.fun();
        System.out.println("In Child  Class - Developer");
    }

}
