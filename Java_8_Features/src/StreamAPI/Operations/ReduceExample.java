package StreamAPI.Operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceExample {
    public static int getMultiplyWithDefaultWay(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> getMultiplyWithOptionalWay(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> a * b);
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 5, 6, 7, 8);
        ArrayList<Integer> emptyList = new ArrayList<>();
        int result1 = getMultiplyWithDefaultWay(integerList);
        System.out.println(result1);

        Optional<Integer> result2 = getMultiplyWithOptionalWay(integerList);
        if (result2.isPresent()) {
            System.out.println(result2.get());
        }
//        System.out.println(result2.get());


    }
}
