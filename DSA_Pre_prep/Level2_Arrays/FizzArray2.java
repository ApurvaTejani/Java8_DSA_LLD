package DSA_Pre_prep.Level2_Arrays;

import java.util.Arrays;

// Given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. Note: String.valueOf(xxx) will make the String form of most types. The syntax to make a new string array is: new String[desired_length]  (See also: FizzBuzz Code)
// izzArray2(4) → ["0", "1", "2", "3"]
// fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
// fizzArray2(2) → ["0", "1"]
public class FizzArray2 {
    public static void main(String[] args) {
        String[] arr = fizzArray2(0);
        System.out.println(Arrays.toString(arr));
    }

    public static String[] fizzArray2(int n) {
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(i);
        }
        return arr;
    }
}
