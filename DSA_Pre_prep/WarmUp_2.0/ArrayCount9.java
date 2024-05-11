
// Given an array of ints, return the number of 9's in the array.


// arrayCount9([1, 2, 9]) → 1
// arrayCount9([1, 9, 9]) → 2
// arrayCount9([1, 9, 9, 3, 9]) → 3

import java.util.Scanner;

public class ArrayCount9 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array Size");
    int length = sc.nextInt();
    int arr[] = new int[length];
    for(int i=0;i<length;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println(arrayCount9(arr));
    
}
public static int arrayCount9(int arr[]){
int count=0;
for (int i=0;i<arr.length;i++)
{
    if(arr[i]==9)
    {
        count++;
    }
}
return count;
}
    
}