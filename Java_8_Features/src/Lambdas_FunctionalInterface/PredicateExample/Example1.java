package Lambdas_FunctionalInterface.PredicateExample;

import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = (i) -> i % 3 == 0;
        Predicate<Integer> p2 = (i) -> i % 5 == 0;
        System.out.println(p1.and(p2).test(15));
    }
}
