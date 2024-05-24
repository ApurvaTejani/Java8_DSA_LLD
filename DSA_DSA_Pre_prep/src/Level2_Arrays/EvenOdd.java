package Level2_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
//
//
//        evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
//        evenOdd([3, 3, 2]) → [2, 3, 3]
//        evenOdd([2, 2, 2]) → [2, 2, 2]
public class EvenOdd {
    public static void main(String[] args) {
        int arr[] = {3, 3, 2};
        System.out.println(Arrays.toString(evenOddMethod(arr)));
    }

    public static int[] evenOddMethod(int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                al.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1)
                al.add(arr[i]);
        }
        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = al.get(i);
        }
        return arr1;
    }
}
