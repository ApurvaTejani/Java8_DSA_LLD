package DSA_Pre_prep.Level2_Arrays;
// We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.

// isEverywhere([1, 2, 1, 3], 1) → true
// isEverywhere([1, 2, 1, 3], 2) → false
// isEverywhere([1, 2, 1, 3, 4], 1) → false
public class IsEveryWhere {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 3, 4 };
        System.out.println(isEverywhere(arr, 1));
    }

    public static boolean isEverywhere(int[] arr, int n) {
        if (arr.length == 0)
            return true;
        boolean flag[] = new boolean[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == n || arr[i + 1] == n)
                flag[j] = true;
            j++;
        }
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == false)
                return false;
        }
        return true;
    }
}
