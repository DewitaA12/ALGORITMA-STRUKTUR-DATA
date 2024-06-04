package Week11.TugasSLL;

public class Node {
    public final int input; // or you may change to private int input
    Mahasiswa data;
    Node next;

    public Node(Mahasiswa mhs){
        this.data = mhs;
        this.next = null;
        this.input = 0;
    }

    public Node(Mahasiswa input, Node berikutnya) {
        this.data = input;
        this.next = berikutnya;
        this.input = 0;
    }
}
