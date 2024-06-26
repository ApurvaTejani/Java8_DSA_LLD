package S9_DesginPatterns.ObserverDesignPattern.Services;

import S9_DesginPatterns.ObserverDesignPattern.AmazonPLMain;
import S9_DesginPatterns.ObserverDesignPattern.CreateOrderObserver;
import S9_DesginPatterns.ObserverDesignPattern.OrderDetails;

public class EmailService implements CreateOrderObserver {
    @Override
    public void createNewOrder(OrderDetails od) {
        System.out.println("Logic to send Emails when new order is created");
    }

    public EmailService() {
        AmazonPLMain.am.register(this);
    }
}
