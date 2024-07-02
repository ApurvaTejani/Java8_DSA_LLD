package S9_DesginPatterns.PenDesign.Pens;

import S9_DesginPatterns.PenDesign.Pen;
import S9_DesginPatterns.PenDesign.Refil;

public class BallPen extends Pen {
    private Refil r;

    public Refil getR() {
        return r;
    }

    public void setR(Refil r) {
        this.r = r;
    }
}
