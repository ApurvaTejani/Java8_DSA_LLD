package CodingBat.Level2_Arrays;

import java.util.ArrayList;
import java.util.List;

// Given an array of ints, return true if it contains no 1's or it contains no 4's.

// no14([1, 2, 3]) → true
// no14([1, 2, 3, 4]) → false
// no14([2, 3, 4]) → true
public class No14 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 4 };
        System.out.println(no14(arr));
    }

    public static boolean no14(int[] arr) {
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        if (al.contains(1)) {
            if (al.contains(4))
                return false;
        }
        return true;
    }
}
