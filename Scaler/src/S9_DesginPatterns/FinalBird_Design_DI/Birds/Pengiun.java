package S9_DesginPatterns.FinalBird_Design_DI.Birds;

public class Pengiun extends Bird implements Talkable {
    public void eat() {
        System.out.println("Pengiun is eating");
    }

    public void makeSound() {
        System.out.println("trump trump trump");
    }
}
