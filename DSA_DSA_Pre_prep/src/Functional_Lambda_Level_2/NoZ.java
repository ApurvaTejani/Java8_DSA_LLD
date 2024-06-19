package Functional_Lambda_Level_2;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
//
//
//        noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
//        noZ(["hziz", "hzello", "hi"]) → ["hi"]
//        noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
public class NoZ {
    public static void main(String[] args) {
        List<String> stringList = List.of("hello", "howz", "are", "youz");
        System.out.println(noZMethod(stringList));
    }

    public static List<String> noZMethod(List<String> stringList) {
        return stringList.stream()
                .filter(s -> !s.contains("z"))
                .collect(Collectors.toList());
    }
}
