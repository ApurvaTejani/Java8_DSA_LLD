package WarmUp_1;

class Main {

    public Main() {
        this(2, 3);
    }

    public Main(int a, int b) {
        System.out.println("Frist Value " + a);
        System.out.println("Second Value " + b);
    }

    // Change
    public Main print() {
        return this;
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.print().print();
    }

}