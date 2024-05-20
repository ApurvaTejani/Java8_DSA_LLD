package MultiThreading.InterThreadSync;

public class Consumer extends Thread {
    MyData d;

    public Consumer(MyData d) {
        this.d = d;
    }

    public void run() {
        while (true) {
            System.out.println("Conusmer" + d.getData());
        }
    }
}
