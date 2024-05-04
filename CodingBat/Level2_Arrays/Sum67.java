package CodingBat.Level2_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.

// sum67([1, 2, 2]) → 5
// sum67([1, 2, 2, 6, 99, 99, 7]) → 5
// sum67([1, 1, 6, 7, 2]) → 4
public class Sum67 {
    public static void main(String[] args) {
        int arr[] = { 1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7 };
        System.out.println(sum67Method(arr));
    }

    public static int sum67Method(int arr[]) {
        // int sum = 0;
        // ArrayList al = new ArrayList<>();
        // for (int i = 0; i < arr.length; i++) {
        // al.add(arr[i]);
        // }
        // int postion_6 = al.indexOf(6);
        // int postion_7 = al.indexOf(7);
        // for (int i = 0; i < arr.length; i++) {
        // if (i >= postion_6 && i <= postion_7)
        // continue;
        // sum = sum + arr[i];
        // }
        // return sum;
        // ChatGPT Solution Working
        int sum = 0;
        boolean ignore = false;

        for (int num : arr) {
            if (num == 6) {
                ignore = true; // Start ignoring
            } else if (num == 7 && ignore) {
                ignore = false; // Stop ignoring
            } else if (!ignore) {
                sum += num; // Add to sum if not in the ignored section
            }
        }

        return sum;
    }
}
