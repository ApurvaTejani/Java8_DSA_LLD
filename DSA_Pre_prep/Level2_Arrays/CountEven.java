
// Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

// countEvens([2, 1, 2, 3, 4]) → 3
// countEvens([2, 2, 0]) → 3
// countEvens([1, 3, 5]) → 0
package CodingBat.Level2_Arrays;

public class CountEven {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5 };
        System.out.println(countEvens(arr));
    }

    public static int countEvens(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }
        return count;
    }
}
