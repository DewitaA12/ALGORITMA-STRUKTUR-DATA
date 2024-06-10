package Week12.DaftarFilm;

public class DaftarFilmDLL {
    Node head;
    int size;

    DaftarFilmDLL() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Film item) {
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node newNode = new Node(current, item, current.next);
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus !");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus !");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.prev.next = null;
            size--;
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas !");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public Film getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.data;
    }

    public Film getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Film get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Film getId(String id) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node tmp = head;
        while (tmp != null) {
            if (tmp.data.getId().equals(id)) {
                return tmp.data;
            }
            tmp = tmp.next;
        }
        throw new Exception("Film dengan ID " + id + " tidak ditemukan");
    }

    public void daftarFilm() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Cetak Data");
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public void daftarFilmRatingDESC() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            // Menggunakan Bubble Sort untuk mengurutkan berdasarkan rating
            for (int i = 0; i < size - 1; i++) {
                Node current = head;
                for (int j = 0; j < size - i - 1; j++) {
                    if (current.data.getRating() < current.next.data.getRating()) {
                        // Tukar data
                        Film temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                    }
                    current = current.next;
                }
            }

            daftarFilm(); // Cetak daftar film setelah diurutkan
        }
    }
}
