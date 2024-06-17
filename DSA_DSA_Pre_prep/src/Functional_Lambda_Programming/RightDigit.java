package Functional_Lambda_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
//
//
//        rightDigit([1, 22, 93]) → [1, 2, 3]
//        rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
//        rightDigit([10, 0]) → [0, 0]
public class RightDigit {
    public static void main(String[] args) {
        List<Integer> il = List.of(16, 8, 886, 8, 1);
        System.out.println(rightDigitMethod(il));
    }

    public static List<Integer> rightDigitMethod(List<Integer> il) {
//        return il.stream()
//                .map(s -> s % 10)
//                .collect(Collectors.toList());
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < il.size(); i++) {
            Integer x = il.get(i) % 10;
            al.add(x);
        }
        List<Integer> list = al;
        return list;
    }
}
