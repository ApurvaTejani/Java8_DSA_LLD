package GeeksForGeeks.Abstraction;

public class Rectangle extends BaseShape {
    private double length;
    private double bredth;

    private String color;

    public Rectangle(String color, double l, double b) {
        super(color);
        length = l;
        bredth = b;
    }

    @Override
    public double getArea() {
        return length * bredth;
    }

    @Override
    public double getCircumference() {
        return length + bredth;
    }
}
