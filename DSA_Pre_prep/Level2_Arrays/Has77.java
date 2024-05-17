package DSA_Pre_prep.Level2_Arrays;

public class Has77 {

    // Given an array of ints, return true if the array contains two 7's next to
    // each other, or there are two 7's separated by one element, such as with {7,
    // 1, 7}.

    // has77([1, 7, 7]) → true
    // has77([1, 7, 1, 7]) → true
    // has77([1, 7, 1, 1, 7]) → false
    // has77([2, 7, 2, 2, 7, 7]) → true
    public static void main(String[] args) {
        int arr[] = { 2, 7, 2, 2, 7, 7 };
        System.out.println(has77method(arr));
    }

    public static boolean has77method(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 7) {
                int rem = arr.length - i - 1;// 6-4 =2
                if (rem == 1) {
                    if (arr[i + 1] == 7)
                        return true;
                } else if (arr[i + 1] == 7 || arr[i + 2] == 7)
                    return true;
            }

        }
        return false;

    }
}
