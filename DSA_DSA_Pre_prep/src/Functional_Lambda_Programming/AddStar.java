package Functional_Lambda_Programming;

//Given a list of strings, return a list where each string has "*" added at its end.
//
//
//        addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
//        addStar(["hello", "there"]) → ["hello*", "there*"]
//        addStar(["*"]) → ["**"]

import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public static void main(String[] args) {
        List<String> list = List.of("a", "bb", "ccc");
        System.out.println(addStar(list));
    }

    public static List<String> addStar(List<String> stringList) {
        return stringList.stream()
                .map(s -> s.concat("*"))
                .collect(Collectors.toList());
    }
}
