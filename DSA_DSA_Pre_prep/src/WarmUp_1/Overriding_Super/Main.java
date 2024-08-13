package WarmUp_1.Overriding_Super;

import WarmUp_1.Developer;
import WarmUp_1.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e = new Developer();
        e.fun();
    }
}
