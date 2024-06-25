package MultiThreading;

class mythread11 extends Thread {
    public void run() {
        int i = 0;
        while (i < 20000) {
            System.out.println(i + " in thread 1");
            i++;
        }
    }
}

class mythread12 extends Thread {
    public void run() {
        int i = 0;
        while (i < 20000) {
            System.out.println(i + " in thread 2");
            i++;
        }
    }
}

public class Daemon_join {
    public static void main(String[] args) {

        mythread11 t1 = new mythread11();
        Thread mainThr = Thread.currentThread();
        t1.setDaemon(true);
        t1.start();

        mythread12 t2 = new mythread12();
        t2.setDaemon(true);
        t2.start();

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
