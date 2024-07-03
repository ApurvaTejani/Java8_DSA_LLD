package Basic_OOPs.Circle_Point;

//Create a class Point.
//        It should have 2 data-members:
//        x : int
//        y : int
//        Create a class Circle.
//        It should have 2 data-members
//        center : Point
//        radius : int
//        It should have 3 methods
//        getArea : It should return area of circle as a double
//        getParameter : It should return parameter of circle as a double
//        isOverlapping : It should take another Circle as parameter and return true if the current circle overlaps with the   circle passed as parameter and false otherwise.
//        Note : Use Math.PI for the accurate value of pi in calculation.
public class Circle {

    int radius;
    Point center;

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getParameter() {
        return Math.PI * radius * 2;
    }

    boolean isOverlapping(Circle anotherCircle) {
        return anotherCircle.center.x == this.center.x && anotherCircle.center.y == this.center.y;
    }
}
