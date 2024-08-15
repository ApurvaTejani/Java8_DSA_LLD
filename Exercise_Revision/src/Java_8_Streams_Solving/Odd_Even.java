package Java_8_Streams_Solving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Separate odd and even numbers in a list of integers
//
//        Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("ODD: " + getOdd(list) + " Even: " + getEven(list));
    }

    public static List<Integer> getOdd(List<Integer> list) {
        List<Integer> oddlist = list.stream().filter(i -> i % 2 != 0)
                .collect(Collectors.toList());
        return oddlist;
    }

    public static List<Integer> getEven(List<Integer> list) {
        List<Integer> evenList = list.stream().filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        return evenList;
    }
}
