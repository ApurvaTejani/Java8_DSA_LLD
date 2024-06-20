package Functional_Lambda_Level_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args) {
        String str = "Have a Good Day";
        System.out.println(getNoOfWords(str));
    }

    public static long getNoOfWords(String str) {
        return Arrays.stream(str.split("\\s")).count();

    }
}
