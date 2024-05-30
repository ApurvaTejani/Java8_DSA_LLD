package Lambdas_FunctionalInterface.MethodReference;

import java.util.function.Consumer;

public class Restrictions {
    int instanceVar = 10;

    public void Method() {
        final int localVar = 20; // Local Method Variable should be final
        Consumer<Integer> c1 = i -> {


            int lambdaVar = 30; // Lambda Exoression can have their own variable
            instanceVar = instanceVar + 5; // Instance varibale can be modified
//            localVar = localVar + 5;  // Local Variable cannot be modified . They should be final
            lambdaVar = lambdaVar + 5; // Variable inside Lambda can be modified

            System.out.println(i + instanceVar + localVar + lambdaVar);
        };
        c1.accept(40);
    }


    public static void main(String[] args) {
        Restrictions r = new Restrictions();
        r.Method();

    }
}
