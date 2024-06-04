package Week11.QueueBasedLinkedList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private Mahasiswa next;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.next = null;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public Mahasiswa getNext() {
        return next;
    }

    public void setNext(Mahasiswa next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }
}

