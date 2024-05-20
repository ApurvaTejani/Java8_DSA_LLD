package MultiThreading.Sync_CustomerATM;

public class CusAtmMain {
    public static void main(String[] args) {
        ATM atm = new ATM();

        Customer c1 = new Customer("Ajit", 1000, atm);

        c1.start();
        Customer c2 = new Customer("Hiten", 2000, atm);
        c2.start();
        Customer c3 = new Customer("Sujit", 3000, atm);
        c3.start();
    }
}
