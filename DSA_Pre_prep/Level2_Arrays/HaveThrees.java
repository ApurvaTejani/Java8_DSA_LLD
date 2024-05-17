package DSA_Pre_prep.Level2_Arrays;
// Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

// haveThree([3, 1, 3, 1, 3]) → true
// haveThree([3, 1, 3, 3]) → false
// haveThree([3, 4, 3, 3, 4]) → false
public class HaveThrees {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 3, 4, 3, 4, 4 };
        System.out.println(haveThreeMethod(arr));
    }

    public static boolean haveThreeMethod(int arr[]) {
        // int count = 0;
        // int j = 0;
        // boolean flag[] = new boolean[arr.length - 1];
        // for (int i : arr) {
        // if (i == 3)
        // count++;
        // }
        // if (count == 3) {
        // for (int i = 0; i < arr.length - 1; i++) {
        // if ((arr[i] != arr[i + 1]) && (arr[i] == 3 || arr[i + 1] == 3))
        // flag[j] = true;
        // else if (arr[i] != 3 && arr[i + 1] != 3)
        // flag[j] = true;
        // j++;
        // }
        // } else if (count != 3)
        // return false;
        // for (boolean b : flag) {
        // if (b == false)
        // return false;

        // }
        // return true;

        int count = 0;
        boolean adjacent = false; // to check if there are adjacent 3's
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                count++; // count the number of 3's
                if (i > 0 && arr[i - 1] == 3) {
                    adjacent = true; // if current 3 is adjacent to the previous 3
                }
            }
        }
        return count == 3 && !adjacent;
    }

}
