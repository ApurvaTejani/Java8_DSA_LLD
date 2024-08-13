package GeeksForGeeks.Overriding_Static;

import GeeksForGeeks.Developer;
import GeeksForGeeks.Employee;

class Main {

    public static void main(String[] args) {
        Employee e = new Developer();
        e.funStatic();
    }

}