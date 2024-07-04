package Interface_Abstract.Car_Solution;
//Write a class Car with following requirements
//        It should have 2 data-members
//        Price: int
//        Speed: int
//        We should be able to sort a Collection or Array of Cars on price.
//        Implement required interface for that

public class Car implements Comparable<Car> {
    int Price;
    int Speed;

    String name;


    public Car(String name, int Price, int speed) {
        this.name = name;
        this.Price = Price;
        this.Speed = speed;
    }

    @Override
    public int compareTo(Car c) {
        return (this.Price - c.Price);
    }

    @Override
    public String toString() {
        return "Car{ The Name " + name +
                " Price=" + Price +
                ", Speed=" + Speed +
                '}';
    }
}
