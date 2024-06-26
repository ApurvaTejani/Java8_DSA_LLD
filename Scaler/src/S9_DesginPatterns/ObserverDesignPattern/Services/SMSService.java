package S9_DesginPatterns.ObserverDesignPattern.Services;

import S9_DesginPatterns.ObserverDesignPattern.AmazonPLMain;
import S9_DesginPatterns.ObserverDesignPattern.CreateOrderObserver;
import S9_DesginPatterns.ObserverDesignPattern.OrderDetails;

public class SMSService implements CreateOrderObserver {
    @Override
    public void createNewOrder(OrderDetails od) {
        System.out.println("Logic to send SMS when new order is created");
    }

    public SMSService() {
        AmazonPLMain.am.register(this);
    }
}
