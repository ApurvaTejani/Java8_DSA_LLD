public class Main {
    public static void main(String[] args) {
        Node n = new Node(10);
        Node n1 = new Node(n);
        n1.setNext(new Node(20));
    }

}
