package AbdulBariJava.MultiThreading.InterThreadSync;

public class MyData {
    int v;
    boolean flag = true;

    synchronized public void setData(int v) {

        try {
            while (flag != true)
                wait();
            this.v = v;
            flag = false;
            notify();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    synchronized public int getData() {
        int x = 0;
        try {

            while (flag != false)
                wait();
            x = v;
            flag = true;
            notify();
            //

        } catch (Exception e) {
            System.out.println();
        }
        return x;
    }
}
