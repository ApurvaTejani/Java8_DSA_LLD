package Functional_Lambda_Level_2;

//Given a list of integers, return a list of the integers, omitting any that are less than 0.
//
//
//        noNeg([1, -2]) → [1]
//        noNeg([-3, -3, 3, 3]) → [3, 3]
//        noNeg([-1, -1, -1]) → []

import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    public static void main(String[] args) {
        List<Integer> il = List.of(-1, -1, -1);
        System.out.println(noNeg(il));
    }

    public static List<Integer> noNeg(List<Integer> il) {
        return il.stream()
                .filter(s -> s >= 0)
                .collect(Collectors.toList());
    }
}
