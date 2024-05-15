package DSA_Pre_prep.Level2_Arrays;

// Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

// either24([1, 2, 2]) → true
// either24([4, 4, 1]) → true
// either24([4, 4, 1, 2, 2]) → false
public class Either24 {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 1, 2, 2 };
        System.out.println(either24(arr));
    }

    public static boolean either24(int arr[]) {
        int count_2 = 0;
        int count_4 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 2 && arr[i + 1] == 2)
                count_2++;
            else if (arr[i] == 4 && arr[i + 1] == 4)
                count_4++;
        }
        if (count_2 >= 1 && count_4 >= 1)
            return false;
        else if (count_2 >= 1)
            return true;
        else if (count_4 >= 1)
            return true;
        else
            return false;
    }
}
