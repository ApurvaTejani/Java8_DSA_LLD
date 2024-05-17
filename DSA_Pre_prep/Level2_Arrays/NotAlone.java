package DSA_Pre_prep.Level2_Arrays;
// We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it. Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.

// notAlone([1, 2, 3], 2) → [1, 3, 3]
// notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
// notAlone([3, 4], 3) → [3, 4]

import java.util.Arrays;

public class NotAlone {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 5, 2 };
        System.out.println(Arrays.toString(notAlone(arr, 2)));
    }

    public static int[] notAlone(int arr[], int n) {
        if (arr.length < 3)
            return arr;

        if (arr.length >= 3) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] == n && i != 0) {
                    if ((arr[i + 1] == arr[i - 1]) && (arr[i] >= arr[i + 1])) {
                        arr[i + 1] = arr[i];
                        i++;

                    } else if (arr[i + 1] > arr[i] && (arr[i + 1] > arr[i - 1])) {
                        arr[i] = arr[i + 1];

                    } else if (arr[i + 1] > arr[i] && (arr[i - 1] > arr[i + 1])) {
                        arr[i] = arr[i - 1];
                        i++;

                    }
                }
            }
        }
        return arr;
    }
}
