package InterThreadSync;

public class Producer extends Thread {
    MyData d;

    public void run() {
        int i = 0;
        while (true) {
            d.setData(i);
            System.out.println("Producer " + i);
            i++;
        }
    }

    public Producer(MyData d) {
        this.d = d;
    }
}
