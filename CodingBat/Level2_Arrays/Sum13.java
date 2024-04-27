package CodingBat.Level2_Arrays;

// Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

// sum13([1, 2, 2, 1]) → 6
// sum13([1, 1]) → 2
// sum13([1, 2, 2, 1, 13]) → 6
public class Sum13 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 13, 1 };
        System.out.println(sum13Method(arr));
    }

    public static int sum13Method(int arr[]) {
        int sum = 0;
        int ignoreLoop = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) {

                ignoreLoop = i;
                continue;
            }
            if (i == ignoreLoop + 1)
                continue;
            sum = sum + arr[i];
        }
        return sum;
    }
}
