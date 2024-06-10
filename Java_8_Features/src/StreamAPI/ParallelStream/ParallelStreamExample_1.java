package StreamAPI.ParallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample_1 {

    public static int sumSequential() {
        return IntStream.rangeClosed(1, 1000000)
                .sum();
    }

    public static int sumParallel() {
        return IntStream.rangeClosed(1, 1000000)// If I increase sum limit Parallel Stream performs better
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("No of Processors " + Runtime.getRuntime().availableProcessors());
        System.out.println("Time Taken by Single Sequential Stream to execute " + checkPerformance(ParallelStreamExample_1::sumSequential, 200));// If I increase No of calls Single Stream Performances Better
        System.out.println("Time Taken by Parallel Stream to execute " + checkPerformance(ParallelStreamExample_1::sumParallel, 200));


    }

    public static long checkPerformance(Supplier<Integer> sp, int noOfCalls) {
        long begin = System.currentTimeMillis();
        for (int i = 0; i < noOfCalls; i++) {
            sp.get();
        }
        long end = System.currentTimeMillis();
        long diff = end - begin;
        return diff;

    }
}
