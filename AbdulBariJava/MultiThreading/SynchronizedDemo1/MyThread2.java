package AbdulBariJava.MultiThreading.SynchronizedDemo1;

public class MyThread2 extends Thread {
    MyData d2;

    public MyThread2(MyData dat) {
        d2 = dat;
    }

    public void run() {
        d2.display(" Welcome to this World");
    }
}
