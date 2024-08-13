package GeeksForGeeks.Abstraction;

public abstract class BaseShape {

    private String color;


    public abstract double getArea();

    public abstract double getCircumference();


    public BaseShape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
