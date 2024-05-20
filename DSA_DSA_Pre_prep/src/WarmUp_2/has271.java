package WarmUp_2;
// Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

// WarmUp_2.has271([1, 2, 7, 1]) → true
// WarmUp_2.has271([1, 2, 8, 1]) → false
// WarmUp_2.has271([2, 7, 1]) → true

import java.util.Scanner;

public class has271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(has271Method(arr));
    }

    public static boolean has271Method(int arr[]) {
        for (int i = 0; i < arr.length - 2; i++) {
            // if ((arr[i] + 5 == arr[i + 1]) && ((arr[i] - 1 == arr[i + 2]) || (arr[i] - 2
            // == arr[i + 2]))) {
            if ((arr[i] + 5 == arr[i + 1]) && (Math.abs(arr[i + 2] - (arr[i] - 1)) <= 2)) {
                return true;
            }
        }
        return false;

    }
}
