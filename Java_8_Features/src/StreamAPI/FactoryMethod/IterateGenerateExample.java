package StreamAPI.FactoryMethod;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class IterateGenerateExample {


    public static void main(String[] args) {
        Stream<String> names = Stream.of("Adam", "Apurva", "tejani");
        names.forEach(System.out::print);

        Stream.iterate(1, x -> x + x)
                .limit(10)
                .forEach(System.out::println);
        //Method Reference - Way 1
        Supplier<Integer> s1 = new Random()::nextInt;
        Stream.generate(s1)
                .limit(10)
                .forEach(System.out::println);

        // Using Lambda Expression - Way 2
        Supplier<Integer> s2 = () -> -new Random().nextInt();

        // Anonymous Class way - Way 3

        Supplier<Integer> s3 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt();
            }
        };

        //Normal Method Traditional Way - Way 4

        SupplierImplementor s4 = new SupplierImplementor();
        while (true) {

            System.out.println(s4.get());
        }
    }
}


