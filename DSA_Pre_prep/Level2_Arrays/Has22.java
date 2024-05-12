package DSA_Pre_prep.Level2_Arrays;

// Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

// has22([1, 2, 2]) → true
// has22([1, 2, 1, 2]) → false
// has22([2, 1, 2]) → false
public class Has22 {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };
        System.out.println(has22Method(arr));
    }

    public static boolean has22Method(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 2) {
                if (arr[i + 1] == 2)
                    return true;
            }
        }
        return false;
    }
}