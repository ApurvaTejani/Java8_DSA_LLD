package Functional_Lambda_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, return a list where each integer is multiplied with itself.
//
//
//        square([1, 2, 3]) → [1, 4, 9]
//        square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
//        square([]) → []
public class Square {
    public static void main(String[] args) {
        List<Integer> il = List.of(6, 8, -6, -8, 1);
        System.out.println(squareMethod(il));
    }

    public static List<Integer> squareMethod(List<Integer> il) {
        //Java 8 Way
        // return il.stream().map(s -> s * s).collect(Collectors.toList());
        //Traditional Way
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < il.size(); i++) {
            Integer inz = il.get(i) * il.get(i);
            al.add(inz);
        }
        List<Integer> list = al;
        return list;
    }
}
