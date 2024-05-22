package Level2_Arrays;

//Given an array of ints, return true if every 2 that appears in the array is next to another 2.
//
//
//        twoTwo([4, 2, 2, 3]) → true
//        twoTwo([2, 2, 4]) → true
//        twoTwo([2, 2, 4, 2]) → false


// Havinig logic issues in this
public class TwoTwo {
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 2};
        System.out.println(twotwoMethod(arr));

    }

    public static boolean twotwoMethod(int arr[]) {
        int count = 0;
        int countOf2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == 2) {
                countOf2++;
                if (arr[i + 1] == 2)
                    count++;
            }
        }
        if (arr[arr.length - 1] == 2 && arr[arr.length - 2] == 2)
            countOf2++;
        System.out.println(count + " " + countOf2);
        if (count >= 1 && (2 * count) == countOf2)
            return true;
        else if (count == 0) {
            return true;
        } else
            return false;

    }
}
