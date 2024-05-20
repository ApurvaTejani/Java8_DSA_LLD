package MultiThreading.SynchronizedDemo1;

public class MyData {
    synchronized public void display(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(200);
            } catch (InterruptedException ie) {
                System.out.println("Interruped Exception " + ie);
            }
        }
    }
}
