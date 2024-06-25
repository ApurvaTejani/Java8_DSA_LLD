package S9_DesginPatterns.DecoraterDesign.MandotoryBase;

import S9_DesginPatterns.DecoraterDesign.IceCream;

public class ChocolateCone implements IceCream {
    @Override
    public int getCost() {
        return 12;
    }

    @Override
    public String getDescription() {
        return "A Chocolate Cone";
    }
}
