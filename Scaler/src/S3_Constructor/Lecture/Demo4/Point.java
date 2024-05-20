package S3_Constructor.Lecture.Demo4;

public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(Point p){
        this(p.x, p.y);
    }


    void display(){
        System.out.println("[" + x + ", " + y + "]");
    }

}
