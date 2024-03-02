/**
 * SpeedConverter
 */
public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(12);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;
        else if (kilometersPerHour >= 0) {
            double milesPerHour;
            milesPerHour = 0.6215 * kilometersPerHour;
            milesPerHour = (long) Math.round(milesPerHour);
            return (long) milesPerHour;
        } else
            return 1;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            System.out.println("Invalid Value");
        if (kilometersPerHour >= 0) {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}