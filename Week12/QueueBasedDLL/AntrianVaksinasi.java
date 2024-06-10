package Week12.QueueBasedDLL;

public class AntrianVaksinasi {
    private Node head;
    private int size;

    public AntrianVaksinasi() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPasien(Pasien ps) {
        if (isEmpty()) {
            head = new Node(ps);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, ps);
            current.next = newNode;
        }
        size++;
    }

    public Pasien hapusDataAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return null;
        } else {
            Pasien ps = head.data;
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
            return ps;
        }
    }

    public void daftarAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("+++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++++");
            System.out.println("|    No.  |   Nama  |");
            Node current = head;
            while (current != null) {
                String no = current.data.no; 
                String nama = current.data.nama;
                System.out.printf("| %-7s | %-7s |\n", no, nama); 
                current = current.next;
            }
            System.out.println("Sisa Antrian: " + size);
        }
    }
}