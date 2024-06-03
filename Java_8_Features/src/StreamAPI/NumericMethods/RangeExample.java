package StreamAPI.NumericMethods;

import java.util.stream.IntStream;

public class RangeExample {
    public static void main(String[] args) {
        long count1 = IntStream.range(1, 50).count();
        System.out.println("Range of (1,50) = " + count1);
        IntStream is1 = IntStream.range(1, 50);
        is1.forEach(value -> System.out.print(value + ","));


        System.out.println();
        IntStream is2 = IntStream.rangeClosed(1, 50);
        System.out.println("RangeClosed of (1,50) = " + IntStream.rangeClosed(1, 50).count());
        is2.forEach(value -> System.out.print(value + ","));
    }
}
