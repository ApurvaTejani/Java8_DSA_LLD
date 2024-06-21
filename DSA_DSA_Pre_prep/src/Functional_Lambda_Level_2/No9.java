package Functional_Lambda_Level_2;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
//
//
//        no9([1, 2, 19]) → [1, 2]
//        no9([9, 19, 29, 3]) → [3]
//        no9([1, 2, 3]) → [1, 2, 3]
public class No9 {
    public static void main(String[] args) {
        List<Integer> il = List.of(1, 2, 3);
        System.out.println(no9Number(il));
    }

    public static List<Integer> no9Number(List<Integer> il) {
        return il.stream()
                .filter(s -> s % 10 != 9)
                .collect(Collectors.toList());
    }
}
