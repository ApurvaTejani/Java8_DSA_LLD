package S0_Extras.Shallow_DeepCopy;

import S5_Inheritance_Poly.Lecture.A;

public class Address {
    public String city;

    public Address(String c) {
        this.city = c;
    }


    //Add Address clone method for Deep Copy
    public Address cloneAddress() {
        return new Address();
    }

    public Address() {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
