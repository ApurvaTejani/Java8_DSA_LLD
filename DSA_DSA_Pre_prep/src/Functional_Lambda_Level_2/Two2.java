package Functional_Lambda_Level_2;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
//
//
//        two2([1, 2, 3]) → [4, 6]
//        two2([2, 6, 11]) → [4]
//        two2([0]) → [0]
public class Two2 {
    public static void main(String[] args) {
        List<Integer> il = List.of(0);
        System.out.println(two2Method(il));
    }

    public static List<Integer> two2Method(List<Integer> il) {
        return il.stream()
                .map(s -> s * 2)
                .filter(s -> s % 10 != 2)
                .collect(Collectors.toList());
    }
}
