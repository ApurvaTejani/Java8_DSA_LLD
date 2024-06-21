package Functional_Lambda_Level_2;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
//
//
//        noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
//        noYY(["a", "b", "cy"]) → ["ay", "by"]
//        noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]
public class NoYY {
    public static void main(String[] args) {
        List<String> stringList = List.of("xx", "yya", "zz");
        System.out.println(noYYMethod(stringList));
    }

    public static List<String> noYYMethod(List<String> stringList) {
        return stringList.stream()
                .filter(s -> !s.contains("yy"))
                .filter(s -> !s.endsWith("y"))
                .map(s -> s.concat("y"))
                .collect(Collectors.toList());
    }
}
