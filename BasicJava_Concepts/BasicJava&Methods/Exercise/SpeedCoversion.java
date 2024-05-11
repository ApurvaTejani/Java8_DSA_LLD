package Exercise;

public class SpeedCoversion {
    public static void main(String[] args) {
        printConversion(95.75);
    }

        public static long toMilesPerHour(double kilometersPerHour)
        {
            if(kilometersPerHour<0)
                return-1;
            else if (kilometersPerHour>=0)
            {
                double milesPerHour;
                milesPerHour = 0.6215*kilometersPerHour;
                System.out.println(milesPerHour);
                 milesPerHour=(long) Math.round(milesPerHour);
                System.out.println(milesPerHour);
                return (long) milesPerHour;
            }
            else
                return 1;
        }
        public static void printConversion(double kilometersPerHour)
        {
            if(kilometersPerHour<0)
                System.out.println("Invalid Value");
            if(kilometersPerHour>=0) {
                long milesPerHour = toMilesPerHour(kilometersPerHour);
                System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
            }
        }
    }

