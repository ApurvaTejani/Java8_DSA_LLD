package GeeksForGeeks.Abstraction;

public class Square extends BaseShape {
    private double side;
    private String color;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getCircumference() {
        return side + side;
    }
}
