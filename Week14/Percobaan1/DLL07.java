package Week14.Percobaan1;


public class DLL07 {
    Node07 head;    // kepala dari DLL
    int size;       // jumlah elemen dalam DLL

    // konstruktor untuk membuat objek DLL baru yang kosong 
    // inisialisasi head menjadi null, dan size menjadi 0
    DLL07(){
        head=null;
        size=0;
    }

    // method untuk memeriksa paakah DLL kosong atau tidak
    // akan mengembalikan nilai true apabila kosong dan
    // false apabila sudah terisi
    boolean isEmpty(){
        return head == null;
    }

    // method untuk menambahkan elemen baru diawal DLL
    // dengan 2 parameter yang akan disimpan dalam simpul baru
    public void addFirst(int item, int jarak){
        if (isEmpty()) {
            head = new Node07(null, item, jarak, null);
        } else {
            Node07 newNode = new Node07(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }


    // method untuk mendapatkan jumlah elemn dalam DLL
    public int size(){
        return size;
    }

    // method untuk menghapus semua elemen dalam DLL
    // mengosongkan head dan mengatur size menjadi 0
    public void clear(){
        head = null;
        size = 0;
    }

    // method untuk menghapus simpul denngan data tertentu dari DLL
    // dengan parameter index yang akan dihapus
    public void remove(int index) {
        Node07 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next !=null){
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }



    // method untuk mendapatkan informasi jarak dari simpul dengan indeks tertentu dalam DLL
    public int getJarak(int index)throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception ("Nilai indeks di luar batas.");
        } 
        Node07 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
}

public int[] getAllData() {
    int[] dataArray = new int[size];
    Node07 current = head;
    int index = 0;
    while (current != null) {
        dataArray[index++] = current.data;
        current = current.next;
    }
    return dataArray;
}

}