package Java_IO_Stream.PipedStrems;

import java.io.InputStream;

public class Consumer extends Thread {
    InputStream is;

    public Consumer(InputStream i) {
        is = i;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int x;
                x = is.read();
                // Thread.sleep(100);
                System.out.println("Consumer " + x);
                System.out.flush();

            }

        } catch (Exception e) {

        }

    }
}
