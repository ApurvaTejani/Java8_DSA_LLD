package DSA_Pre_prep.Level2_Arrays;

// Given an array of ints, return true if the number of 1's is greater than the number of 4's

// more14([1, 4, 1]) → true
// more14([1, 4, 1, 4]) → false
// more14([1, 1]) → true
public class More14 {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 1, 4 };
        System.out.println(more14Method(arr));
    }

    public static boolean more14Method(int arr[]) {
        int count_one = 0;
        int count_four = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                count_one++;
            else if (arr[i] == 4)
                count_four++;

        }
        if (count_one > count_four)
            return true;
        else
            return false;
    }
}
