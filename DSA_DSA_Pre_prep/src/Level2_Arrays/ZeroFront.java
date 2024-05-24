package Level2_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
//
//
//        zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
//        zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
//        zeroFront([1, 0]) → [0, 1]
public class ZeroFront {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 0};
        System.out.println(Arrays.toString(zeroFront(arr)));
    }

    public static int[] zeroFront(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                al.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                al.add(arr[i]);
        }
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = al.get(i);
        }

        return arr1;
    }
}
