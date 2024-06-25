package S9_DesginPatterns.DecoraterDesign.MandotoryBase;

import S9_DesginPatterns.DecoraterDesign.IceCream;

public class HoneyCone implements IceCream {
    @Override
    public int getCost() {
        return 18;
    }

    @Override
    public String getDescription() {
        return "A Honey Cone";
    }
}
