package Functional_Lambda_Programming;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
//
//
//        copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
//        copies3(["24", "a", ""]) → ["242424", "aaa", ""]
//        copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
public class Copies3 {
    public static void main(String[] args) {
        List<String> stringList = List.of("hello", "there");
        System.out.println(copies3Method(stringList));
    }

    public static List<String> copies3Method(List<String> stringList) {
        return stringList.stream().map(s -> s.concat(s).concat(s))
                .collect(Collectors.toList());
    }
}
