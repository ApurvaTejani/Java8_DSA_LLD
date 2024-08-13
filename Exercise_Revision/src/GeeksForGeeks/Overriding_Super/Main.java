package GeeksForGeeks.Overriding_Super;

import GeeksForGeeks.Developer;
import GeeksForGeeks.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e = new Developer();
        e.fun();
    }
}
