package WarmUp_1;

import java.util.Date;
import java.util.Scanner;

public class test {
    //Find out prime numbers

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date d = new Date();
        long t1 = System.currentTimeMillis();
//        long N = 2000000000;
        long N = 25;
        int count = 0;
        Runtime.getRuntime().gc();
        long m1 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        for (int i = 1; i * i <= N; i++) {

            if (N % i == 0) {
                if (i * i == N) {
                    count++; // Perfect square case
                } else
                    count += 2;
            }

        }
        System.out.println(count);
        if (count == 2)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");

        long t2 = System.currentTimeMillis();
        double timeTaken = (t2 - t1) / 1000;
        Runtime.getRuntime().gc();
        long m2 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        double memUsed = (m2 - m1) / 1024;
        System.out.println("Time taken " + timeTaken + " secs and Memory used " + memUsed);
    }


}
