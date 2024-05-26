package Lambdas_FunctionalInterface.FuncInterface;

import java.util.function.Function;

public class Example_1 {
    static Function<String, String> upperCase = (name) -> name.toUpperCase();
    static Function<String, String> concatSomething = (name) -> name.concat("Default");

    public static void main(String[] args) {
        System.out.println(upperCase.apply("Java 8 "));
        System.out.println(upperCase.andThen(concatSomething).apply("Java 8 ")); //Outer func exceutes first and then the inner one
        System.out.println(upperCase.compose(concatSomething).apply("Java 8 ")); // Inner func executes first and then outer one

    }
}
