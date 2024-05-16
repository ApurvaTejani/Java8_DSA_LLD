
public class UserDefinedExpection {
    public static void main(String[] args) throws NotValidAgeException {
        try {
            int a = 10 / 20;
            System.out.println(a);
            Person p = new Person();
            p.setName("Rupali");
            p.setAge(17);
            p.display();
        }

        catch (NotValidAgeException e) {
            System.out.println(e.getMessage());

        }
    }
}
