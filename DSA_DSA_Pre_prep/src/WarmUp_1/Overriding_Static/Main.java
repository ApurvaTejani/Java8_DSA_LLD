package WarmUp_1.Overriding_Static;

import WarmUp_1.Developer;
import WarmUp_1.Employee;

class Main {

    public static void main(String[] args) {
        Employee e = new Developer();
        e.funStatic();
    }

}