package MultiThreading.Sync_CustomerATM;

public class Customer extends Thread {
    ATM atm;
    String name;
    int amt;

    public Customer(String name, int amt, ATM atm) {
        this.name = name;
        this.amt = amt;
        this.atm = atm;
    }

    public void run() {
        useATM();
    }

    synchronized public void useATM() {
        atm.checkBalance();
        atm.withdrawAmount(name, amt);
    }
}
