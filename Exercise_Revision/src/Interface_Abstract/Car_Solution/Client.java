package Interface_Abstract.Car_Solution;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car c1 = new Car("Mazze", 20, 10);
        Car c2 = new Car("Jeep", 10, 20);
        cars.add(c1);
        cars.add(c2);
        Collections.sort(cars);
        for (Car car : cars) {
            System.out.println(car.toString());
        }

    }
}
