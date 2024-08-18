package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        int[] arr = {4, 2, 31, 3};
        System.out.println(method(new Integer[]{1, 2, 3, 4, 5}, 5));
        List il1 = new ArrayList<>();
        il1.add(1);
        il1.add(2);

        System.out.println(il1);

        ArrayList il2 = new ArrayList<>();

        System.out.println(il1 == il2);

    }

    public static <T> int method(T arr[], T x) {
        int res = 0;
        for (T e : arr) {
            if (e == x) {
                res++;
            }
        }
        return res;
    }
}


