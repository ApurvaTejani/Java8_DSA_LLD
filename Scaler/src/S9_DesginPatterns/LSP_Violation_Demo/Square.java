package S9_DesginPatterns.LSP_Violation_Demo;

public class Square extends Rectangle {
    void setHeight(int ht){
        height = ht;
        width = ht;
    }

    void setWidth(int w){
        width = w;
        height = w;
    }
}
