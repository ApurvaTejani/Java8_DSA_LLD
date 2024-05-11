package AbdulBariJava.JavaLangPackage;

class MyObject {
    public String toString() {
        return "My Object";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }
    // public void notify() // Can't overide this
    // {

    // }
}

public class ObjLangDemo {
    public static void main(String[] args) {
        // Creating and making two different objects equal by making hashCode equal
        MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();

        System.out.println(o1.equals(o2));
    }
}