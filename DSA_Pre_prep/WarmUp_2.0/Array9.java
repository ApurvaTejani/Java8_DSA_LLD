
// Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

// arrayFront9([1, 2, 9, 3, 4]) → true
// arrayFront9([1, 2, 3, 4, 9]) → false
// arrayFront9([1, 2, 3, 4, 5]) → false

public class Array9 {
    public static void main(String[] args) {
        int arr[] = { 2 };
        System.out.println(arrayFront9(arr));
    }

    public static boolean arrayFront9(int arr[]) {

        if (arr.length >= 4) {
            for (int i = 0; i < 4; i++) { // 0 1 2 3
                if (arr[i] == 9) {
                    return true;
                }
            }
        } else if (arr.length < 4) {
            for (int i = 0; i < arr.length; i++) { // 0 1 2 3
                if (arr[i] == 9) {
                    return true;
                }
            }
        }

        return false;
    }

}
