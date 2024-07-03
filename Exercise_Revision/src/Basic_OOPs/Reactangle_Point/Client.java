package Basic_OOPs.Reactangle_Point;

public class Client {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setWidth(10);
        r.setHeight(5);
        Point p = new Point();
        p.setX(6);
        p.setY(6);
        r.setTopleft(p);
        System.out.println(r.getArea() + " " + r.getPerimeter() + "  (" + r.getBottomRight().x + "," + r.getBottomRight().y + ")");
    }
}
