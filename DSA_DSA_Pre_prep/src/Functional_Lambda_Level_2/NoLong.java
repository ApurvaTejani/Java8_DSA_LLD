package Functional_Lambda_Level_2;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, return a list of the strings, omitting any string length 4 or more.
//
//
//        noLong(["this", "not", "too", "long"]) → ["not", "too"]
//        noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
//        noLong(["cccc", "cccc", "cccc"]) → []
public class NoLong {
    public static void main(String[] args) {
        List<String> stringList = List.of("cccc", "cccc", "cccc");
        System.out.println(noLongMethod(stringList));
    }

    public static List<String> noLongMethod(List<String> stringList) {
        return stringList.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toList());
    }
}
