package S9_DesginPatterns.FinalBird_Design_DI.Birds;
public class Sparrow extends Bird implements Flyable, Talkable, Danceable {
    private Flyator flr; // Initially null till not set

    // slow flying bird
    public void plugFlyator(Flyator flr) {
        this.flr = flr;
    }

    public void makeSound() {
        System.out.println("CHi CHI CHI");
    }

    public void dance() {
        System.out.println("Sparrow is dancing");
    }

    public void eat() {
        System.out.println("Sparrow is eating");
    }

    public void fly() {
        if (flr == null) {
            System.out.println("Dependency not plugged");
            return;
        }
        flr.makeFly();
    }

}
