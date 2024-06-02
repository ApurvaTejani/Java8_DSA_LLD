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

    public static Optional<Integer> getMaxNum(List<Integer> integerList) {
        return integerList.stream()
                .reduce((x, y) -> (x > y) ? x : y);
    }

    public static Optional<Integer> getMinNum(List<Integer> integerList) {
        return integerList.stream()
                .reduce((x, y) -> ((x < y)) ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = List.of(5, 2, 8, 7, 6);
        ArrayList<Integer> emptyList = new ArrayList<>();
        int result1 = getMultiplyWithDefaultWay(integerList);
        System.out.println("Sum is " + result1);

        Optional<Integer> result2 = getMultiplyWithOptionalWay(integerList);
        if (result2.isPresent()) {
            System.out.println("Sum is " + result2.get());
        }
//        System.out.println(result2.get());
        Optional<Integer> maxValue = getMaxNum(integerList);
        System.out.println("Maximum value " + maxValue.get());

        Optional<Integer> minValue = getMinNum(integerList);
        System.out.println("Minimum value " + minValue.get());


    }
}
