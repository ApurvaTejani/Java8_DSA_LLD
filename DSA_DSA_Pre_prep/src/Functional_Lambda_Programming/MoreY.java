package Functional_Lambda_Programming;
//Given a list of strings, return a list where each string has "y" added at its start and end.
//
//
//        moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
//        moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
//        moreY(["yay"]) → ["yyayy"]

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    public static void main(String[] args) {
        List<String> stringList = List.of("a", "b", "c");
        System.out.println(moreYMethod(stringList));
    }

    public static List<String> moreYMethod(List<String> stringList) {
        return stringList.stream()
                .map(s -> "y".concat(s).concat("y"))
                .collect(Collectors.toList());
    }
}
