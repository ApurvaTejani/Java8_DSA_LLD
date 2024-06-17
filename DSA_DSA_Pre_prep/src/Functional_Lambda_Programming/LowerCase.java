package Functional_Lambda_Programming;

//Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
//
//
//        lower(["Hello", "Hi"]) → ["hello", "hi"]
//        lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
//        lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LowerCase {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "BBB", "ccc");
        System.out.println(lower(list));
    }

    public static List<String> lower(List<String> stringList) {
        return stringList.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toList());
//        ArrayList<String> str = new ArrayList<>();
//        for (int i = 0; i < stringList.size(); i++) {
//            String s = stringList.get(i).toLowerCase();
//            str.add(s);
//        }
//        List<String> list = str;
//        return list;
    }
}
