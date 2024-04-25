package AbdulBariJava.JavaLangPackage.StringBuffer;

public class MyThread2 extends Thread {
    MyData d2;

    public MyThread2(MyData dat) {
        d2 = dat;
    }

    public void run() {
        StringBuilder sb = new StringBuilder(" Welcome Back");
        d2.display(sb);
    }
}
