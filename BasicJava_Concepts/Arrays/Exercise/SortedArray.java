package BasicJava_Concepts.Arrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = getIntegers(size);
        int sortedArr[] = sortIntegers(arr);
        printArray(sortedArr);

    }

    public static int[] getIntegers(int size) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " contents " + arr[i]);
        }
    }

    public static int[] sortIntegers(int arr[]) {
        Arrays.sort(arr);
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[j] = arr[i];
            j++;
        }
        return arr;
    }
}
