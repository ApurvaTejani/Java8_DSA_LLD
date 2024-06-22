package Functional_Lambda_Level_2;
//
//Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
//
//
//        noTeen([12, 13, 19, 20]) → [12, 20]
//        noTeen([1, 14, 1]) → [1, 1]
//        noTeen([15]) → []

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static void main(String[] args) {
        List<Integer> il = List.of(15);
        System.out.println(noTeen(il));
    }

    public static List<Integer> noTeen(List<Integer> il) {
        return il.stream()
                .filter(s -> s < 13 || s > 19)
                .collect(Collectors.toList());
    }
}
