package Week11.TugasSLL;

public class SLL {
    Node head, tail;

    SLL(){
        head=tail=null;
    }

    boolean isEmpty(){ //kondisi headnya harus berisi null
        return head == null;
    }

    void print(){ // pencetakan data ini tidak memperbolehkan
                 //LL dalam kondisi kosong

        if(!isEmpty()){
            Node tmp = head;
            System.out.print("Isi Linked List ");
            while(tmp != null){
                System.out.print("NIM = " + tmp.data.nim + " ");
                System.out.print("Nama = " + tmp.data.nama + "\t\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }

    }

    void addFirst(Mahasiswa input){
        // node baru yang ditambahkan berisi data melalui parameter
        // pada method addFirst
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            //jika kosong, maka peran head dan tail
            // harus dimiliki node yang sama
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa input){
        // node baru yang ditambahkan berisi data
        // melalui parameter pada method addLast
        Node ndInput = new Node(input, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(String nimKey, Mahasiswa input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        while(temp != null){
            if(temp.data.nim.equals(nimKey)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        }
    }
    

    void insertAt(int position, Mahasiswa input) {
        Node newNode = new Node(input);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return;
        }
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }
}
