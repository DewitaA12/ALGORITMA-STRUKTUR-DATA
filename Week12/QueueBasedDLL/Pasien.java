package Week12.QueueBasedDLL;

public class Pasien {
    String no;
    String nama;
    Pasien next;
    Pasien prev;

    public Pasien(String no, String nama) {
        this.no = no;
        this.nama = nama;
        this.next = null;
        this.prev = null;
    }

    public String getNo() {
        return no;
    }

    public String getNama() {
        return nama;
    }

    public Pasien getNext() {
        return next;
    }

    public Pasien getPrev() {
        return prev;
    }

    public void setNext(Pasien next) {
        this.next = next;
    }

    public void setPrev(Pasien prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return nama;
    }
}
