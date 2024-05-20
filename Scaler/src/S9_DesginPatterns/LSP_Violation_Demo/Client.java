package S9_DesginPatterns.LSP_Violation_Demo;

public class Client {
    public static void main(String[] args) {
        playWithRectangle(new Square());
    }

    static void playWithRectangle(Rectangle r){
        r.setHeight(10);
        r.setWidth(5);
        int area = r.getArea();
        System.out.println(area);
    }
}
