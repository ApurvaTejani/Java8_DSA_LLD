package Level2_Arrays;

//Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
//
//
//        has12([1, 3, 2]) → true
//        has12([3, 1, 2]) → true
//        has12([3, 1, 4, 5, 2]) → true
public class Has12 {
    public static void main(String[] args) {
        int[] arr ={1,3,4,2};
        System.out.println(has12Method(arr));
    }
    public static boolean has12Method(int [] arr){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==1)
            {
                for (int j = i; j < arr.length; j++) {
                    if(arr[j]==2)
                        return true;
                }
            }
        }
        return false;
    }
}
