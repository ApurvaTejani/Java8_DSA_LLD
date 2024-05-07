package CodingBat.Level2_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

// tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
// tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
// tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
public class TenRun {
    public static void main(String[] args) {
        int arr[] = { 2, 10, 3, 4, 20, 5 };
        System.out.println(Arrays.toString(tenRun(arr)));
    }

    public static int[] tenRun(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i] / 10 + " " + arr[i] % 10);
            if (arr[i] == 10) {
                for (int j = i + 1; j < arr.length; j++) {
                    // System.out.println(arr[j] / 10 + " " + arr[j] % 10);
                    if (arr[j] % 10 != 0)
                        arr[j] = 10;
                    else {
                        int q = arr[j] / 10;
                        for (int k = j; k < arr.length; k++) {
                            arr[k] = q * 10;
                        }

                    }

                }
            }
        }
        return arr;
    }
}
