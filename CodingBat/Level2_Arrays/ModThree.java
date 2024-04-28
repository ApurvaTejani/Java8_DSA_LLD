package CodingBat.Level2_Arrays;

// Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.

// modThree([2, 1, 3, 5]) → true
// modThree([2, 1, 2, 5]) → false
// modThree([2, 4, 2, 5]) → true
public class ModThree {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 5 };
        System.out.println(modThree(arr));
    }

    public static boolean modThree(int arr[]) {

        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] % 2 == 0 && arr[i + 1] % 2 == 0 && arr[i + 2] % 2 == 0)
                    || (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1))
                return true;
        }
        return false;
    }
}
