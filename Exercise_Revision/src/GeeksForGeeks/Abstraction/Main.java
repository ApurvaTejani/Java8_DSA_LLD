package GeeksForGeeks.Abstraction;

public class Main {
    public static void main(String[] args) {
        BaseShape r = new Rectangle("Yello", 5, 2);
        System.out.println(r.getArea());
        System.out.println(r.getCircumference());

        BaseShape c = new Circle("Pink", 13);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());
  
    }
}
