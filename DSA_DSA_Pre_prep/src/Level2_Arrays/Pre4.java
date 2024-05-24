package Level2_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

//Given a non-empty array of ints, return a new array containing the elements from the original array that come before
// the first 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to
// create an array of length 0.
//
//
//        pre4([1, 2, 4, 1]) → [1, 2]
//        pre4([3, 1, 4]) → [3, 1]
//        pre4([1, 4, 4]) → [1]
public class Pre4 {
    public static void main(String[] args) {
        int arr[] = {4, 4, 4};
        System.out.println(Arrays.toString(pre4Method(arr)));
    }

    public static int[] pre4Method(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 4)
                break;
            al.add(arr[i]);
        }
        int arr1[] = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr1[i] = al.get(i);
        }
        return arr1;
    }
}
