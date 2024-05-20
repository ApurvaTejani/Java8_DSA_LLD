package S3_Constructor.Exercise.Reactangle_point;

public class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this(p.x, p.y);
    }

}