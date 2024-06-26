package S9_DesginPatterns.FinalBird_Design_DI.Birds;

public class Crow extends Bird implements Flyable, Talkable, Danceable {
    Flyator flr;

    // Fast flying Bird
    public void plugFlyator(Flyator flr) {
        this.flr = flr;
    }

    public void makeSound() {
        System.out.println("COW Cow COw");
    }

    public void dance() {
        System.out.println("Crow is dancing");
    }

    public void eat() {
        System.out.println("Crow is eating");
    }

    public void fly() {
        flr.makeFly();
    }
}
