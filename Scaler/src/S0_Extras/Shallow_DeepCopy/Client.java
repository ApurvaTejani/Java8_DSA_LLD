package S0_Extras.Shallow_DeepCopy;

public class Client {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Apurva";
        Address add = new Address();
        p.setAddress(add);
        p.address.city = "Mumbai";
        System.out.println("Initial Values");
        System.out.println(p.getName() + " " + p.getAddress().getCity());
        System.out.println();
        Person copyP = p.clone();
        System.out.println("Copy Person values");
        System.out.println(copyP.getName() + " " + copyP.getAddress().getCity());
        System.out.println("If it is a shallow copy then changing address of copyP will change the original as well ");
        copyP.address.city = "Bangalore";
        System.out.println(p.getAddress().getCity() + " " + copyP.getAddress().getCity());

    }
}
