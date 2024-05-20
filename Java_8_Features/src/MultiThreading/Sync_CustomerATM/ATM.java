package MultiThreading.Sync_CustomerATM;

public class ATM {
    synchronized public void checkBalance() {
        System.out.println("Checking the balace");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    synchronized public void withdrawAmount(String name, int amt) {
        System.out.println(name + " has withdrawn Rs " + amt);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
