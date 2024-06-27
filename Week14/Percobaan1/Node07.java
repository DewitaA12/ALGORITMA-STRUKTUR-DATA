package Week14.Percobaan1;

//kelas Node07 merpresentasikan sebuah simpul dalam 
//sebuah double linked list dengan informasi jarak tambahan
public class Node07 {
    int data;           // data yang disimpan dalam simpul 
    Node07 prev, next;  // referensi kesimpul sebelumnya(prev), setelahnya(next)
    int jarak;          // informasi jarak tambahan yang terkait dengan simpul


// Konstruktor menginisialisasi objek Node07 denga data. jarak, dan refernsi yang diberikan
    Node07(Node07 prev, int data, int jarak, Node07 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}
