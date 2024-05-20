package Level2_Arrays;
// Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.

// tripleUp([1, 4, 5, 6, 2]) → true
// tripleUp([1, 2, 3]) → true
// tripleUp([1, 2, 4]) → false
public class TripleUp {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4 };
        System.out.println(tripleUp(arr));
    }

    public static boolean tripleUp(int arr[]) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (((1 + arr[i]) == arr[i + 1]) && ((1 + arr[i + 1]) == arr[i + 2]))
                return true;
        }
        return false;
    }
}
