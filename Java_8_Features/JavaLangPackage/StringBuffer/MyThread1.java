package AbdulBariJava.JavaLangPackage.StringBuffer;

public class MyThread1 extends Thread {
    MyData d1;

    public MyThread1(MyData dat) {
        d1 = dat;
    }

    public void run() {
        StringBuilder sb = new StringBuilder("Hello Ji My name is Apurva");
        d1.display(sb);
    }
}
