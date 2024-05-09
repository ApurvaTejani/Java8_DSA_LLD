public class Thread3 implements Runnable {
    @Override
    public void run() {
        DBConnection db4 = DBConnection.getInstance();
        System.out.println("Thread 3 " + db4);
    }
}
