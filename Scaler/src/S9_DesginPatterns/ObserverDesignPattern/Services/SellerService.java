package S9_DesginPatterns.ObserverDesignPattern.Services;

import S9_DesginPatterns.ObserverDesignPattern.AmazonPLMain;
import S9_DesginPatterns.ObserverDesignPattern.CreateOrderObserver;
import S9_DesginPatterns.ObserverDesignPattern.OrderDetails;

public class SellerService implements CreateOrderObserver {
    @Override
    public void createNewOrder(OrderDetails od) {
        System.out.println("Logic to update seller when new order is created");
    }

    public SellerService() {
        AmazonPLMain.am.register(this);
    }
}
