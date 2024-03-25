public class Node {
    int data;
    Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
        System.out.println(data + "Inside Node data" + next);
    }

    public Node(Node node) {
        this.data = node.data;
        if (node.next != null) {
            this.next = new Node(node.next); // Recursive deep copy
        } else {
            this.next = null;
        }
        System.out.println(data + "Inside Node node" + next);
    }
}
