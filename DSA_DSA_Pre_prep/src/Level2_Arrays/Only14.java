package Level2_Arrays;
// Given an array of ints, return true if every element is a 1 or a 4.

// only14([1, 4, 1, 4]) → true
// only14([1, 4, 2, 4]) → false
// only14([1, 1]) → true
public class Only14 {
    public static void main(String[] args) {

    }

    public static boolean only14method(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4 || arr[i] == 1) {
                count++;
            }
        }
        if (count == arr.length)
            return true;
        else
            return false;
    }
}
