package S9_DesginPatterns.PenDesign;

import S9_DesginPatterns.PenDesign.Pens.BallPen;

public class Client {
    public static void main(String[] args) {
        Pen p = new BallPen();

        p.setWritingStrategy(new SlowWritingStrategy());
        p.writing();
    }
}
