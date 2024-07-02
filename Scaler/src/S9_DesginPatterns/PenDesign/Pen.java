package S9_DesginPatterns.PenDesign;

public abstract class Pen {

    private String brand;
    private String penName;
    private int price;

    private WritingStrategy ws;

    public void setWritingStrategy(WritingStrategy ws) {
        this.ws = ws;
    }

    public void writing() {
        ws.write();
    }

}
