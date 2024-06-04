package Week11.QueueBasedLinkedList;

public class AntrianMahasiswa {
    Node head;
    Node tail;

    public AntrianMahasiswa() {
        head = null;
        tail = null;
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        Node newNode = new Node(mahasiswa);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Mahasiswa " + mahasiswa.getNama() + " ditambahkan ke antrian.");
    }

    public Mahasiswa layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else {
            Mahasiswa mahasiswa = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return mahasiswa;
        }
    }

    public void lihatAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian saat ini:");
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    private boolean isEmpty() {
        return head == null;
    }
}

