public class AreaMain {
    public static void main(String[] args) {
        CircleArea c = new CircleArea();
        double area = c.getCircleArea(10);
        area = CircleArea.getCircleArea(20); // This is Class level - function called that means static
        System.out.println(area);
    }
}
