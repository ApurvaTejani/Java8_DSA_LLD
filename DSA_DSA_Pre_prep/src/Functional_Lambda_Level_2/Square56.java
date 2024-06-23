package Functional_Lambda_Level_2;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.
//
//
//        square56([3, 1, 4]) → [19, 11]
//        square56([1]) → [11]
//        square56([2]) → [14]
public class Square56 {
    public static void main(String[] args) {
        List<Integer> il = List.of(2);
        System.out.println(square56(il));
    }

    public static List<Integer> square56(List<Integer> il) {
        return il.stream()
                .map(s -> s * s)
                .map(s -> s + 10)
                .filter(s -> s % 10 != 5 && s % 10 != 6)
                .collect(Collectors.toList());
    }
}
