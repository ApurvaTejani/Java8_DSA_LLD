package DSA_Pre_prep.Level2_Arrays;
// Given an array of ints, return true if the array contains no 1's and no 3's.

// lucky13([0, 2, 4]) → true
// lucky13([1, 2, 3]) → false
// lucky13([1, 2, 4]) → false
public class Lucky13 {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 4 };
        System.out.println(lucky13Method(arr));

    }

    public static boolean lucky13Method(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 3)
                return false;
        }
        return true;
    }
}
