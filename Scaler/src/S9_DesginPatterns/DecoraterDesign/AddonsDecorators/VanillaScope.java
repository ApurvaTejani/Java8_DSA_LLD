package S9_DesginPatterns.DecoraterDesign.AddonsDecorators;

import S9_DesginPatterns.DecoraterDesign.IceCream;

public class VanillaScope implements IceCream {

    private IceCream ic;

    public VanillaScope(IceCream ic) {
        this.ic = ic;
    }

    @Override
    public int getCost() {
        int cost = 22;
        cost = cost + ic.getCost();
        return cost;
    }

    @Override
    public String getDescription() {
        String des = " with vanilla Scope";
        des = ic.getDescription() + des;
        return des;
    }
}
