package Lambdas_FunctionalInterface.MethodReference;

import java.util.function.Function;

public class UpperStrExample {
    static Function<String, String> fnc1 = s -> s.toUpperCase();
    static Function<String, String> fnc2 = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(fnc1.apply("Hello"));
        System.out.println(fnc2.apply("Java 8"));


    }
}
