package S9_DesginPatterns.DecoraterDesign.AddonsDecorators;

import S9_DesginPatterns.DecoraterDesign.IceCream;

public class CherryAddOn implements IceCream {

    private IceCream ic;

    public CherryAddOn(IceCream ic) {
        this.ic = ic;
    }

    @Override
    public int getCost() {
        int cost = 5;
        cost = cost + ic.getCost();
        return cost;
    }

    @Override
    public String getDescription() {
        String des = " with bunch of cherries on the top";
        des = ic.getDescription() + des;
        return des;
    }
}
