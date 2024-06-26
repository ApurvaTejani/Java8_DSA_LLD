package S9_DesginPatterns.ObserverDesignPattern;

import S9_DesginPatterns.ObserverDesignPattern.Services.EmailService;
import S9_DesginPatterns.ObserverDesignPattern.Services.SMSService;
import S9_DesginPatterns.ObserverDesignPattern.Services.SellerService;

public class ClientDemo {
    public static void main(String[] args) {
        EmailService es = new EmailService();
        SMSService sms = new SMSService();
        SellerService ss = new SellerService();
        OrderDetails od = new OrderDetails();
        AmazonPLMain.am.createOrder(od);

    }
}
