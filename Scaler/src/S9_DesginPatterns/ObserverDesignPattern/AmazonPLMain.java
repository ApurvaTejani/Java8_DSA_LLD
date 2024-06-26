package S9_DesginPatterns.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class AmazonPLMain {
    public static final AmazonPLMain am = new AmazonPLMain();
    private List<CreateOrderObserver> cooList = new ArrayList<>();

    private AmazonPLMain() {

    }

    public void register(CreateOrderObserver observer) {
        cooList.add(observer);
    }

    public void unregister(CreateOrderObserver observer) {
        cooList.remove(observer);
    }

    public void createOrder(OrderDetails od) {

        od.orderID = 122334;
        od.phoneNo = 997453823;
        od.pid = 67453;
        od.emailId = "abc@example.com";
        for (CreateOrderObserver obs :
                cooList) {
            obs.createNewOrder(od);
        }
    }
}
