package Basic_OOPs.Circle_Point;

public class Client {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 10;
        Point p1 = new Point();
        p1.x = 2;
        p1.y = 2;
        c1.center = p1;


        Point p2 = new Point();
        p2.x = 3;
        p2.y = 2;
        Circle c2 = new Circle();
        c2.center = p2;

        System.out.println(c1.getArea() + " " + c1.getParameter() + " " + c1.isOverlapping(c2));
    }
}
