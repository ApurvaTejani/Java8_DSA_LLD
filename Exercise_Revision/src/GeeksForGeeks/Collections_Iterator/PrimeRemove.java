package GeeksForGeeks.Collections_Iterator;

import java.util.*;

public class PrimeRemove {
    public static void main(String[] args) {
        Collection<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            al.add(sc.nextInt());
        }
        Iterator<Integer> il = removePrime(al);
        while (il.hasNext()) {
            int x = il.next();
            System.out.println(x);
        }

    }

    public static Iterator<Integer> removePrime(Collection<Integer> al) {
        Iterator<Integer> il = al.iterator();
        while (il.hasNext()) {
            int x = il.next();
            if (isPrime(x))
                il.remove();
        }
        return il;
    }

    public static boolean isPrime(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if ((N % i) == 0)
                count++;
        }
        if (count == 2)
            return true;
        else
            return false;
    }
}
