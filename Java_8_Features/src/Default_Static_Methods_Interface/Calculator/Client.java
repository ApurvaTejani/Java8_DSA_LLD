package Default_Static_Methods_Interface.Calculator;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Calculator c = new CalculatorImplementor();
        List<Integer> il = Arrays.asList(4, 8, 2, 6, 1);
        System.out.println("Multiply " + c.multiply(il));
        System.out.println("Sum " + c.sum(il));
        System.out.println("MAximum No in List " + Calculator.findMaxNo(il));

    }
}
