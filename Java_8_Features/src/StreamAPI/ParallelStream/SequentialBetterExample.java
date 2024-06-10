package StreamAPI.ParallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequentialBetterExample {
    public static int sumUsingSequential(List<Integer> il) {
        long start = System.currentTimeMillis();
        int sum = il.stream().reduce(0, (a, b) -> a + b);
        long end = System.currentTimeMillis();
        System.out.println("Time Taken of summing using Sequential Stream " + (end - start));
        return sum;
    }

    public static int sumUsingParallel(List<Integer> il) {
        long start = System.currentTimeMillis();
        int sum = il.stream().parallel().reduce(0, (a, b) -> a + b);
        long end = System.currentTimeMillis();
        System.out.println("Time Taken of summing using Parallel Stream " + (end - start));
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> il =
                IntStream.rangeClosed(1, 100000).boxed().collect(Collectors.toList());
        sumUsingSequential(il);
        sumUsingParallel(il);
    }


}
