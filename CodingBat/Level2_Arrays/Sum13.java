package CodingBat.Level2_Arrays;

public class Sum13 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 13, 1 };
        System.out.println(sum13Method(arr));
    }

    public static int sum13Method(int arr[]) {
        int sum = 0;
        int ignoreLoop = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 13) {

                ignoreLoop = i;
                continue;
            }
            if (i == ignoreLoop + 1)
                continue;
            sum = sum + arr[i];
        }
        return sum;
    }
}
