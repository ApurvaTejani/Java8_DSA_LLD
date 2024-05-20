package S9_DesginPatterns.LSP_Solution_Demo;

public class Rectangle {
    int height;
    int width;

    public Rectangle(int h, int w){
        height = h;
        width = w;
    }

    int getArea(){
        return height * width;
    }
}
