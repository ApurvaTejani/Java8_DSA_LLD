public class Thread1 implements Runnable {
    @Override
    public void run() {
        DBConnection db1 = DBConnection.getInstance();
        System.out.println("Thread 1 " + db1);
    }
}
