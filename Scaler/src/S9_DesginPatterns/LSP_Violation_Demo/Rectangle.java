package S9_DesginPatterns.LSP_Violation_Demo;

public class Rectangle {
    int height;
    int width;

    void setHeight(int ht){
        height = ht;
    }

    void setWidth(int w){
        width = w;
    }

    int getArea(){
        return height * width;
    }
}
