
public class ReverseNumber {
    public static void main(String[] args) {
        int newNumber = 0;
        int number = 1234;
        while (number > 0) {
            int r = number % 10; // 4
            newNumber = newNumber * 10 + r; // 4
            number = number / 10; // 123
        }
        System.out.println(newNumber);

    }
}
