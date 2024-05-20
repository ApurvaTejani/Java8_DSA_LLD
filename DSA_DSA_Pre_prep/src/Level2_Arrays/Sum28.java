package Level2_Arrays;
// Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

// sum28([2, 3, 2, 2, 4, 2]) → true
// sum28([2, 3, 2, 2, 4, 2, 2]) → false
// sum28([1, 2, 3, 4]) → false
public class Sum28 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(sum28Method(arr));
    }

    public static boolean sum28Method(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                sum = sum + arr[i];
            }
        }
        if (sum == 8)
            return true;
        else
            return false;
    }
}
