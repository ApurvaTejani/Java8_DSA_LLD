package Functional_Lambda_Level_2;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
//
//
//        no34(["a", "bb", "ccc"]) → ["a", "bb"]
//        no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
//        no34(["ccc", "dddd", "apple"]) → ["apple"]
public class No34 {
    public static void main(String[] args) {
        List<String> stringList = List.of("ccc", "dddd", "apple");
        System.out.println(no34(stringList));
    }

    public static List<String> no34(List<String> stringList) {
        return stringList.stream()
                .filter(s -> s.length() != 3 && s.length() != 4)
                .collect(Collectors.toList());
    }
}
