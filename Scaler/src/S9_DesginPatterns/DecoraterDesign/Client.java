package S9_DesginPatterns.DecoraterDesign;

import S9_DesginPatterns.DecoraterDesign.AddonsDecorators.CherryAddOn;
import S9_DesginPatterns.DecoraterDesign.AddonsDecorators.VanillaScope;
import S9_DesginPatterns.DecoraterDesign.MandotoryBase.ChocolateCone;

public class Client {
    // Customer wants an IceCream of Chocolate cone and wants Vanilla as scope and some cherries on top of it.
    public static void main(String[] args) {
        IceCream ic = new ChocolateCone();
        IceCream icWv = new VanillaScope(ic);
        IceCream icWvWc = new CherryAddOn(icWv);
        int totalCost = icWvWc.getCost();
        String finalDescription = icWvWc.getDescription();
        System.out.println("=====Bill for Icream=======");
        System.out.println(icWvWc.getDescription());
        System.out.println("Total Cost " + icWvWc.getCost());

    }
}
