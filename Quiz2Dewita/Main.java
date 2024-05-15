package Quiz2Dewita;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addFirst(45);
        dll.addFirst(10);
        dll.addFirst(10);
        dll.addFirst(15);
        dll.addFirst(150);
        dll.print();
        // dll.deleteFirst();
        dll.print();
        dll.printFromTail();
        System.out.println("------sebelum ditambahkan data baru");
        dll.print();
        dll.addLast(24);
        System.out.println("------setelah ditambahakan data baru");
        dll.print();
        System.out.println("-------print from head");
        dll.print();
        System.out.println("-------print from tail");
        dll.printFromTail();
        System.out.println("Merge dll1 dan dll2");
        dll.merge();

        DoubleLinkedList dll1 = new DoubleLinkedList();
        dll1.addFirst(9);
        dll1.addFirst(8);
        dll1.addFirst(7);
        dll1.addFirst(6);
        

        DoubleLinkedList dll2 = new DoubleLinkedList();
        dll2.addFirst(5);
        dll2.addFirst(4);
        dll2.addFirst(3);
        dll2.addFirst(2);
        


        // dll.print();
        // dll.printFromTail();
        //lanjutkan dengan memanggil method addLast, deleteLast, printFromTail
        //lanjutkan dengan memanggil method merge, split
    }
    //No. 3 Kode Ganjil
    public void merge(DoubleLinkedList dll1,
            DoubleLinkedList dll2){
        System.out.print("Berikut merge data dll1 dan dll2 : " );
        dll1.print();
        dll2.print();
        //complete this method
    }
    //No. 3 Kode Genap
    public static void split(DoubleLinkedList dll){
        //ex: 2,3,4,34,2,3,45,4 (original list)
        //list 1-> 2,3,4,34
        //list 2-> 2,3,45,4
    }    
    
    
}
