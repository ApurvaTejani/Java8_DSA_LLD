import java.io.Serializable;

public class Customer implements Serializable {
    String custID;
    String name;
    String phoneno;

    public Customer() {

    }

    @Override
    public String toString() {
        return "Customer [custID=" + custID + ", name=" + name + ", phoneno=" + phoneno + "]";
    }

    public Customer(String custID, String name, String phoneno) {
        this.custID = custID;
        this.name = name;
        this.phoneno = phoneno;
    }

}
