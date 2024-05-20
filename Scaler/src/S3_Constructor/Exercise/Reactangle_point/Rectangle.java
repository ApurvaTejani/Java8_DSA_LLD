package S3_Constructor.Exercise.Reactangle_point;

public class Rectangle {

    Point topLeft;
    Point bottomRight;

    Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
        this.topLeft = new Point(topLeftX, topLeftY);
        this.bottomRight = new Point(bottomRightX, bottomRightY);
    }

    Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = new Point(topLeft);
        this.bottomRight = new Point(bottomRight);
    }

    Rectangle(Rectangle r) {
        this(r.topLeft, r.bottomRight);
    }
}