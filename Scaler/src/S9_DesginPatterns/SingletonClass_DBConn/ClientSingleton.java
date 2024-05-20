package S9_DesginPatterns.SingletonClass_DBConn;

public class ClientSingleton {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        Thread t3 = new Thread(new Thread3());
        t1.start();
        t2.start();
        t3.start();

        DBConnection db3 = DBConnection.getInstance();
        System.out.println("Main thread " + db3);

        t1.join();
        t2.join();
    }
}