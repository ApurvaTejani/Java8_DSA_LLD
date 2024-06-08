package StreamAPI.NumericMethods;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MappingExample {
    public static void main(String[] args) {

        // Stream of int is getting converted to DoubleStream
        IntStream.rangeClosed(1, 10)
                .mapToDouble(i -> i)
                .forEach(System.out::println);


        // Stream of int is getting converted to List of Object that is List of Integer
        List<Integer> il = ObjectReturnExample();
        System.out.println(il);

    }

    public static List<Integer> ObjectReturnExample() {
        return IntStream.rangeClosed(1, 5)
                .mapToObj(i -> new Integer(i))
                .collect(Collectors.toList());

    }

}
