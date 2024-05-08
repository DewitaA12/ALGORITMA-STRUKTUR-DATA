package Week12;

public class Node {
    int data;
    Node next, prev;

    Node(Node p, int d, Node n) {
        this.data = d;
        this.next = n;
        this.prev = p;
    }
}
