package StreamAPI.NumericMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class BoxingUnboxing {
    public static void main(String[] args) {
        //boxing Example
        Stream<Integer> si = boxingMehtod();
        si.forEach(value -> System.out.print(value + " ,"));
        System.out.println();
        List<Integer> al = Arrays.asList(7, 8, 9, 10);
        IntStream is = unBoxingMethod(al);
        is.forEach(value -> System.out.print(value + " ,"));
    }

    public static Stream<Integer> boxingMehtod() {
        return IntStream.rangeClosed(1, 5)
                .boxed();
    }

    public static IntStream unBoxingMethod(List<Integer> al) {
        return al.stream()
                .mapToInt(Integer::intValue);
    }
}
