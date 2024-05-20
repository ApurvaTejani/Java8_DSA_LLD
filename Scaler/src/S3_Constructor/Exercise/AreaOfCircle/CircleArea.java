package S3_Constructor.Exercise.AreaOfCircle;// Create a class Math with following requirements
// - A class level data member called PI set to 3.14
// - A class level method called getCircleArea, which takes as input an integer parameter called radius. This function should return area of the circle as a double

public class CircleArea {

    static double PI = 3.14;

    static double getCircleArea(int radius) {
        return (radius * radius * 3.14);
    }
}
