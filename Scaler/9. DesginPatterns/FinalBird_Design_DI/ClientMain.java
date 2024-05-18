import Birds.*;
//import Flyator;
//import FinalBird_Design_DI.SlowFlying.java;
//import FinalBird_Design_DI.FastFlying.java;
//import FinalBird_Design_DI.Birds.Pengiun.java;

public class ClientMain {
    public static void main(String[] args) {
        System.out.println("========Sparrow==================");
        Sparrow sp = new Sparrow();
        // Writing a code to handle null pointer exception
        sp.fly();
        Flyator sftr = new SlowFlying();
        sp.plugFlyator(sftr);
        sp.fly();
        System.out.println("===========================");
        System.out.println("Client told that now sparrow flys faster");
        // Client told that now sparrow flys faster
        Flyator fftr = new FastFlying();
        sp.plugFlyator(fftr);
        sp.fly();

        /// Random Method to test if working or not
        System.out.println("========Pengiun==================");
        Pengiun p = new Pengiun();
        p.makeSound();
        System.out.println("========Kiwi==================");
        Kiwi k = new Kiwi();
        k.eat();
        System.out.println("========Crow==================");
        Crow c = new Crow();
        c.plugFlyator(fftr);
        c.fly();
        c.dance();

    }
}
