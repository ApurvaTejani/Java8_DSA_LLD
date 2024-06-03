package StreamAPI.NumericMethods;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class AggregationMethod {
    public static void main(String[] args) {
        int sum1 = IntStream.rangeClosed(1, 50).sum();
        int max1 = IntStream.rangeClosed(1, 50).max().getAsInt();
        double avg1 = IntStream.rangeClosed(1, 50).average().getAsDouble();
        IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ","));
        System.out.println();
        System.out.println("Sum Max Average");
        System.out.println(sum1 + " " + max1 + " " + avg1);
        OptionalInt max2 = IntStream.rangeClosed(1, 50).max();
        OptionalDouble avg2 = IntStream.rangeClosed(1, 50).average();
        System.out.println("OptionalMax OptionalAvg");
        System.out.println(max2 + "  " + avg2);
        DoubleStream db = IntStream.rangeClosed(1, 50).asDoubleStream();
        db.forEach(value -> System.out.print(value + ","));
    }
}
