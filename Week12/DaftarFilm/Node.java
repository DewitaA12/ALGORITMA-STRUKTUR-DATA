package Week12.DaftarFilm;

public class Node {
    Film data;
    Node next, prev;

    Node(Node p, Film d, Node n) {
        this.data = d;
        this.next = n;
        this.prev = p;
    }
    
}
