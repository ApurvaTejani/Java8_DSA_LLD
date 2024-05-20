package Level2_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Return a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.

// withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
// withoutTen([10, 2, 10]) → [2, 0, 0]
// withoutTen([1, 99, 10]) → [1, 99, 0]
public class WithoutTen {
    public static void main(String[] args) {
        int arr[] = { 1, 99, 10, 10, 44, 33, 21 };
        System.out.println(Arrays.toString(withoutTen(arr)));
    }

    public static int[] withoutTen(int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                al.add(arr[i]);
            }
        }

        int rem = arr.length - al.size();
        while (rem > 0) {
            al.add(0);
            rem--;
        }
        int[] array = al.stream().mapToInt(Integer::valueOf).toArray();
        return array;
    }
}
