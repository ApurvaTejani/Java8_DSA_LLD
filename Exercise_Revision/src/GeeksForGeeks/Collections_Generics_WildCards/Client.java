package GeeksForGeeks.Collections_Generics_WildCards;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<? extends Employee> employeeList = new ArrayList<>();
        List<Developer> developerList = new ArrayList<>();
        employeeList = developerList;

    }
}
