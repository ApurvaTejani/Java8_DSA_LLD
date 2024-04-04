package MostAsked;

import java.util.*;

// In this programming challenge, you are given an incomplete Java method named findSecondLargestElement(int[] array) in the class ArrayMagic.
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Arrays: " + Arrays.toString(arr));
        int num = secondlargestnumber(arr);
        System.out.println(num);

    }

    public static int secondlargestnumber(int arr[]) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if (!(arrlist.contains(arr[i]))) {
                arrlist.add(arr[i]);
            }
        }
        // System.out.println(arrlist);
        arrlist.sort(Comparator.naturalOrder());
        if (arrlist.isEmpty() || arrlist.size() == 1)
            return -1;
        int num = arrlist.get(arrlist.size() - 2);
        return num;
    }
}
