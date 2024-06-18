package S0_Extras.Shallow_DeepCopy;

public class Person {
    public String name;
    public Address address;

    //Shallow Copy Constructor
//    public Person(String n, Address a) {
//        this.name = n;
//        this.address = a.;
    //Deep Copy Constructor
    public Person(String n, Address a) {
        this.name = n;
        this.address = a.cloneAddress();
    }

    public Person() {

    }

    public Person(Person p) {
        this(p.name, p.address);
    }

    public Person clone() {
        return new Person(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
