package AbdulBariJava.LambdaExpression;

interface MyLambda {
    public void display();
}

// Normal Class Implmenting Interface
/*
 * class My implements MyLambda
 * {
 * public void display()
 * {
 * System.out.println("Hello World");
 * }
 * }
 */
public class LambdaExp_1 {
    public static void main(String[] args) {
        // Lambda Exp
        MyLambda m = () -> {
            System.out.println("Hello world");
        };
        // Inner Class
        /*
         * //MyLambda m=new My();
         * MyLambda m=//new MyLambda()
         * ()->
         * 
         * //public void display()
         * {
         * System.out.println("Hello World");
         * 
         * };
         */
        m.display();

    }
}
