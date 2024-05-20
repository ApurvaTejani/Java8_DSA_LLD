package Java_IO_Stream.PipedStrems;

import java.io.OutputStream;

public class Producer extends Thread {
    OutputStream os;

    public Producer(OutputStream o) {
        os = o;
    }

    @Override
    public void run() {
        try {
            int count = 0;
            while (true) {
                os.write(count);
                os.flush();
                // Thread.sleep(100);
                System.out.println("Producer " + count);
                System.out.flush();

                count++;
            }
        } catch (Exception e) {

        }

    }
}
