package Default_Static_Methods_Interface.Calculator;

import java.util.List;

public class CalculatorImplementor implements Calculator {
    @Override
    public int multiply(List<Integer> il) {
        return il.stream().reduce(1, (a, b) -> a * b);
    }

    public int sum(List<Integer> il) {
        return il.stream()
                .reduce(0, (a, b) -> a + b);
    }
}
