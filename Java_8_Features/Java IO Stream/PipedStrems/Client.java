import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pos.connect(pis);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        p.start();
        c.start();
    }

}
