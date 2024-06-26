package WarmUp_2;
// Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

// noTriples([1, 1, 2, 2, 1]) → true
// noTriples([1, 1, 2, 2, 2, 1]) → false
// noTriples([1, 1, 1, 2, 2, 2, 1]) → false

import java.util.Scanner;

public class noTriple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(noTriples(arr));

    }

    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < (nums.length - 2); i++) {
            if ((nums[i] == nums[i + 1]) && (nums[i + 1] == nums[i + 2])) {
                return false;
            }
        }
        return true;
    }
}
