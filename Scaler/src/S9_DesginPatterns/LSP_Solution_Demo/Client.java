package S9_DesginPatterns.LSP_Solution_Demo;

public class Client {
    public static void main(String[] args) {
        playWithRectangle(new Square(20));
    }

    static void playWithRectangle(Rectangle r){
        int area = r.getArea();
        System.out.println(area);
    }
}
