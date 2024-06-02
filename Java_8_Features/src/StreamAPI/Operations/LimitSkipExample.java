package StreamAPI.Operations;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class LimitSkipExample {

    public static Optional<Integer> limitMethod(List<Integer> il) {
        return il.stream()
                .limit(2)
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skipMethod(List<Integer> il) {
        return il.stream()
                .skip(2)
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> il = List.of(5, 8, 2, 6);
        Optional<Integer> Top2Sum = limitMethod(il);
        System.out.println("Top 2 Elements sum " + Top2Sum.get());

        Optional<Integer> Skip2Sum = skipMethod(il);
        System.out.println("Skipping  2 Elements and the summing " + Skip2Sum.get());


    }
}
