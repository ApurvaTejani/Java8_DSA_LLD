package S9_DesginPatterns.BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Student s = Student.getBuilder()
                .setName("Apurva")
                .setAge(26)
                .setPsp(70)
                .setPhoneNo(12345678)
                .builderMethod();// Validations


        System.out.println(s);
    }


}
