package AbdulBariJava.MultiThreading.SynchronizedDemo1;

public class MyThread1 extends Thread {
    MyData d1;

    public MyThread1(MyData dat) {
        d1 = dat;
    }

    public void run() {
        d1.display("Hello Ji My name is Apurva");
    }
}
