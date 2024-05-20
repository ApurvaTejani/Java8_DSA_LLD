package Level2_Arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.

// post4([2, 4, 1, 2]) → [1, 2]
// post4([4, 1, 4, 2]) → [2]
// post4([4, 4, 1, 2, 3]) → [1, 2, 3]
public class Post4 {
    public static void main(String[] args) {
        int arr[] = { 4, 4, 1, 2, 4 };
        System.out.println(Arrays.toString(post4(arr)));
    }

    public static int[] post4(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                for (int j = i + 1; j < nums.length; j++) {
                    al.add(nums[j]);
                }
                break;
            }

        }
        int[] array = al.stream().mapToInt(Integer::valueOf).toArray();

        return array;
    }
}
