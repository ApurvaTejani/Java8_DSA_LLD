package LambdaExpression;


// Having issue need to revisit
interface mylambda {
    void display(String str);
}

public class LambdaExp_MethodRef {
    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        // MyLambda ml = System.out::println;
        // ml.display("Hello");
        mylambda ml = LambdaExp_MethodRef::reverse;
        ml.display("Hello");
    }
}
