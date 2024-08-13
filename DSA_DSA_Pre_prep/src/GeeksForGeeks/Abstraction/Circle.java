package GeeksForGeeks.Abstraction;

public class Circle extends BaseShape {
    private String color;

    private int radius;

    public Circle(String color, int radius) {
        super(color);

        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getCircumference() {
        return Math.PI * 2 * radius;
    }
}
