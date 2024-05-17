package DSA_Pre_prep.Level2_Arrays;

import java.util.Arrays;

// Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

// shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
// shiftLeft([1, 2]) → [2, 1]
// shiftLeft([1]) → [1]
public class ShiftLeft {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(Arrays.toString(shiftleft(arr)));
    }

    public static int[] shiftleft(int[] arr) {
        if (arr.length == 0)
            return arr;
        int newArr[] = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i + 1];
        }
        newArr[arr.length - 1] = arr[0];
        return newArr;
    }

}
