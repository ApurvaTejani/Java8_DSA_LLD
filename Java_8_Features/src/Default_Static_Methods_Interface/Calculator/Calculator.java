package Default_Static_Methods_Interface.Calculator;

import java.util.List;
import java.util.Optional;

public interface Calculator {
    int multiply(List<Integer> il);

    //Wrong Method
    default int sum(List<Integer> il) {
        return il.stream()
                .reduce(-1000, (a, b) -> a + b);
    }

    // Can't Override Static Methods
    static int findMaxNo(List<Integer> il) {
        Optional<Integer> maxOp = il.stream().reduce((a, b) -> (a > b) ? a : b);
        return maxOp.get().intValue();
    }


}
