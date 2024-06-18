package Functional_Lambda_Programming;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
//
//
//        math1([1, 2, 3]) → [20, 30, 40]
//        math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
//        math1([10]) → [110]
public class Math1 {
    public static void main(String[] args) {
        List<Integer> il = List.of(6, 8, 6, 8, 1);
        System.out.println(math1(il));
    }

    public static List<Integer> math1(List<Integer> il) {
        return il.stream()
                .map(s -> s + 1)
                .map(s -> s * 10)
                .collect(Collectors.toList());
    }
}
