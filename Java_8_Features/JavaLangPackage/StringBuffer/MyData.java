package StringBuffer;

public class MyData {

    public void display(StringBuilder sb) {
        synchronized (this) {
            for (int i = 0; i < sb.length(); i++) {
                System.out.print(sb.charAt(i));
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ie) {
                    System.out.println("Interruped Exception " + ie);
                }
            }
        }

    }
}
