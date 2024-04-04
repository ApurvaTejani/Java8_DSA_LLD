package MostAsked;

import java.util.Scanner;

public class TargetFetch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array lenght size");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the elements of arrays");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 3 4 2 1
        }
        System.out.println("Enter the target Element ");
        int target = sc.nextInt();
        int sum[] = new int[2 * length];
        int k = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum[k] = arr[i] + arr[j];// 7 5 4 6 5 3
                if (sum[k] == target) {
                    x = i;
                    y = j;
                    break;
                }
                k++;
            }
        }
        System.out.println("X is " + x + " Y is " + y);
    }
}
