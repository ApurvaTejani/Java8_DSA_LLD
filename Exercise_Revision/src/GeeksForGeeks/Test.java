package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        byte b = 127;
        System.out.println((byte) (b + 1));
        String s = null;
        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1);
        System.out.println(i2.getClass());
        if (i1 == i2) {
            System.out.println("Same");
        }

    }

    public static <T> int method(T arr[], T x) {
        return 0;
    }
}


