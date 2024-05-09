public class Thread2 implements Runnable {
    @Override
    public void run() {
        DBConnection db2 = DBConnection.getInstance();
        System.out.println("Thread 2 " + db2);
    }
}
