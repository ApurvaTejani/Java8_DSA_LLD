package Level2_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.

// zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
// zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
// zeroMax([0, 1, 0]) → [1, 1, 0]
public class ZeroMax {

    public static void main(String[] args) {
        int arr[] = { 7, 0, 4, 3, 0, 0 };
        System.out.println(Arrays.toString(zeroMax(arr)));
    }

    public static int[] zeroMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i != arr.length - 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] % 2 == 1 && arr[j] >= max) {
                        max = arr[j];
                    }
                }
                arr[i] = max;
                max = 0;
            }

        }
        return arr;
    }
}