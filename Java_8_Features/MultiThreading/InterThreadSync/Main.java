package InterThreadSync;

public class Main {
    public static void main(String[] args) {
        MyData d = new MyData();
        Producer t1 = new Producer(d);
        Consumer t2 = new Consumer(d);
        t1.start();
        t2.start();
    }
}
