import java.util.Scanner;

public class Car {
    public static int calculateCars(int wheels, int bodies, int chairs) {
        // Calculate the maximum number of cars that can be assembled
        int cars = Math.min(wheels / 4, Math.min(bodies / 1, chairs / 2));
        return cars;
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of wheels, bodies, and chairs separated by spaces: ");
            String[] inputs = scanner.nextLine().split(" ");

            if (inputs.length != 3) {
                throw new IllegalArgumentException(
                        "Invalid input format. Please enter three integers separated by spaces.");
            }

            int wheels = Integer.parseInt(inputs[0]);
            int bodies = Integer.parseInt(inputs[1]);
            int chairs = Integer.parseInt(inputs[2]);

            if (wheels < 0 || bodies < 0 || chairs < 0) {
                throw new IllegalArgumentException("Inputs cannot be negative");
            }

            int cars = calculateCars(wheels, bodies, chairs);
            System.out.println("The maximum number of cars that can be assembled is: " + cars);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
