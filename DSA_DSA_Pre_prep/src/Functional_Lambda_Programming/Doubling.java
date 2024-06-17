package Functional_Lambda_Programming;

import java.util.List;
import java.util.stream.Collectors;

//
//Given a list of integers, return a list where each integer is multiplied by 2.
//
//
//        doubling([1, 2, 3]) → [2, 4, 6]
//        doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
//        doubling([]) → []
public class Doubling {
    public static void main(String[] args) {
        List<Integer> al = List.of();
        System.out.println(doublingMethod(al));
    }

    public static List<Integer> doublingMethod(List<Integer> al) {
        return al.stream()
                .map(s -> s * 2)
                .collect(Collectors.toList());
    }

}
