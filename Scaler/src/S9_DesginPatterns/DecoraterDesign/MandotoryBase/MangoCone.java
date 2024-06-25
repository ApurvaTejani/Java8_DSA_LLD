package S9_DesginPatterns.DecoraterDesign.MandotoryBase;

import S9_DesginPatterns.DecoraterDesign.IceCream;

public class MangoCone implements IceCream {
    @Override
    public int getCost() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "A Mango Cone";
    }
}
