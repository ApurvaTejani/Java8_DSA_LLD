package Lambdas_FunctionalInterface.RunnableEx;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    System.out.println("Before java 8 runnable using anonymous method =" + i++);

                }
            }
        };

//        Runnable r2 = () -> {
//            int i = 0;
//            while (true) {
//                System.out.println("Inside Lambda Expr method 2 = " + i++);
//            }
//        };

        Thread t1 = new Thread(r1);
        t1.start();
        // Most concise version
        new Thread(() -> {
            int i = 0;
            while (true) {
                System.out.println("Java 8 feature using Lambda expr = " + i++);
            }
        }).start();

    }
}

