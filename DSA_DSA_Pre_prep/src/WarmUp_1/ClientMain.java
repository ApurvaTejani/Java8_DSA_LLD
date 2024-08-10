package WarmUp_1;

public class ClientMain {
    public static void main(String[] args) {
        Test test1 = new Test("Apu");
        Test test2 = new Test("Ram");
        Test test3 = new Test("Ajay");
        Test test4 = new Test();
        System.out.println("No of test obj created: " + Test.getCountTest());
    }
}
