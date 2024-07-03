package Basic_OOPs.Reactangle_Point;

//Create a class Rectangle. It should have 3 data-members
//
//        topLeft:Point
//        height:int
//        width:int
//        It should have 3 methods
//
//        getArea: It should return area of rectangle as an integer
//        getPerimeter: It should return perimeter of rectangle as an integer
//        getBottomRight: It should return a Point to represent the bottom right of the Rectangle.
public class Rectangle {
    private int height;
    private int width;
    private Point topleft;

    public int getArea() {
        return height * width;
    }

    public int getPerimeter() {
        return 2 * (height + width);
    }

    public Point getBottomRight() {
        Point p1 = new Point();
        p1.setX(topleft.x + width);
        p1.setY(topleft.y - height);
        return p1;
    }


    public void setHeight(int height) {
        this.height = height;
    }


    public void setWidth(int width) {
        this.width = width;
    }


    public void setTopleft(Point topleft) {
        this.topleft = topleft;
    }
}
