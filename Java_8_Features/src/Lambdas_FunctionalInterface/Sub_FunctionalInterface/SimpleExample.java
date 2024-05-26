package Lambdas_FunctionalInterface.Sub_FunctionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class SimpleExample {
    static UnaryOperator<Integer> unOp = (i) -> (i * i);
    static BinaryOperator<Integer> biOp = (a, b) -> a * b;
    static Comparator<Integer> con = (a, b) -> a.compareTo(b);
    static BinaryOperator<Integer> minBy = BinaryOperator.minBy(con);

    public static void main(String[] args) {
        System.out.println(unOp.apply(9));
        System.out.println(biOp.apply(3, 4));
        System.out.println(minBy.apply(3, 5));
    }
}
