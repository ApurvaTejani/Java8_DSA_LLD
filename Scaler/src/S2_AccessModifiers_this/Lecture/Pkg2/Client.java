package S2_AccessModifiers_this.Lecture.Pkg2;


import S2_AccessModifiers_this.Lecture.Pkg1.Person;

public class Client {
    public static void main(String[] args) {
        Person p = new Person();
        p.d1 = 10;
//        p.d2 = 20;
//        p.d3 = 30;
    }
}
