package Functional_Lambda_Programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, return a list where each string has all its "x" removed.
//
//
//        noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
//        noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
//        noX(["x"]) → [""]
public class NoX {


    public static void main(String[] args) {
        List<String> list = List.of("xxax", "xbxbx", "xxcx");
        System.out.println(noX(list));
    }

    public static List<String> noX(List<String> stringList) {
        return stringList.stream()
                .map(s -> {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == 'x')
                            continue;
                        else
                            sb.append(s.charAt(i));
                    }
                    String s1 = new String(sb);
                    return s1;

                }).peek(s -> System.out.println(s)).collect(Collectors.toList());
    }
}
