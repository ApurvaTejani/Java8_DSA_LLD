package Methods_Java.Exercise;

public class Dog_Cat {
    public static void main(String[] args) {

        // We have a dog that likes to bark. We need to wake up if the dog is barking at
        // night!
        // Write a method shouldWakeUp that has 2 parameters.
        // We have to wake up if the dog is barking before 8 or after 22 hours so in
        // that case return true.
        // In all other cases return false.
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));

        // Playing Cat Problem Statement
        // The cats spend most of the day playing. In particular,
        // they play if the temperature is between 25 and 35 (inclusive).
        // Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
        // Method needs to return true if the cat is playing, otherwise return false

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay < 8 || hourOfDay > 22) && barking == true && ((hourOfDay >= 0 && hourOfDay <= 23))) {
            return true;
        }
        return false;

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (((temperature >= 25 && temperature <= 35) && summer == false)
                || ((temperature >= 25 && temperature <= 45) && summer == true))
            return true;
        return false;
    }

}
