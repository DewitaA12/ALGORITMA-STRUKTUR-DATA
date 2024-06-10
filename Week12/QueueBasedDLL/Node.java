package Week12.QueueBasedDLL;


public class Node {
    Pasien data;
    Node next;
    Node prev;

    public Node(Pasien data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public Node(Node current, Pasien ps) {
        this.data = ps;
        this.next = null;
        this.prev = current;
    }
}