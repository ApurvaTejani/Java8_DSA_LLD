package CodingBat.Level2_Arrays;

public class MatchUp {
    public static void main(String[] args) {
        int arr1[] = { 5, 3 };
        int arr2[] = { 1, 1 };
        System.out.println(matchUp(arr1, arr2));
    }

    public static int matchUp(int arr1[], int arr2[]) {
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] - arr1[i] == 2 || arr2[i] - arr1[i] == 1 || arr2[i] - arr1[i] == -2 || arr2[i] - arr1[i] == -1)
                count++;
        }
        return count;
    }
}
