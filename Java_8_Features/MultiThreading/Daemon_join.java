package AbdulBariJava.MultiThreading;

class MyThread extends Thread {
    public void run() {
        int i = 0;
        while (i < 20000) {
            System.out.println(i + " in thread");
            i++;
        }
    }
}

public class Daemon_join {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        Thread mainThr = Thread.currentThread();
        t.setDaemon(true);
        t.start();

        // Thread mainThr = Thread.currentThread(); // refernce mainThr to Main thread
        // try {
        // mainThr.join(); // makes main method to wait to complete the other threads
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        int i = 0;
        while (true) {
            System.out.println(i + " in Main");
            i++;
            Thread.yield(); // maing the main method slow to excute
        }
    }
}
