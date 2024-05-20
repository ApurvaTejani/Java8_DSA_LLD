package ExceptionHandling;

class LowBalanceException extends Exception {
    // public String toString() {
    // return "Balance Should not be less than 5000";
    // }
}

public class CheckedUncheck {

    static void fun1() {
        try {
            System.out.println("Inside Function 1");
            throw new LowBalanceException();
        } catch (LowBalanceException e) {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("Exiting Function 1");
    }

    static void fun2() {
        System.out.println("Inside Function 2");
        try {
            int arr[] = new int[4];
            arr[4] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound");
        }
        fun1();
        System.out.println("Exiting Function 2");
    }

    static void fun3() {
        System.out.println("Inside Function 3");
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Number is divisble by 0");
        }
        fun2();
        System.out.println("Exiting Function 3");
    }

    public static void main(String[] args) {
        fun3();

    }

}
