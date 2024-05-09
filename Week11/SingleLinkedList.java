package Week11;

public class SingleLinkedList {
    Node head, tail;

    SingleLinkedList(){
        head=tail=null;
    }

    boolean isEmpty(){ //kondisi headnya harus berisi null
    if (head == null) {
        return true;
    } else {
        return false;
    }
    }

    void print(){ // pencetakan data ini tidak memperbolehkan LL dalam kondisi kosong

        if(!isEmpty()){
            Node tmp = head;
            System.out.print("Isi Linked List ");
            while(tmp != null){
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        } 

    }

    void addFirst(int input){
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

    void addLast(int input){
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

    void insertAfter(int key, int input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){ //ganti dengan ==
                    // jika tidak ada node selanjutnya
                    // maka jadikan ndInput sebagai tail
                    tail = ndInput;
                    break; // di rem 
                }
            }
            temp = temp.next;
        } 
        while(temp != null); //ganti tidak sama dengan
    }

    void insertAt(int index, int input){
        // pastikan operasi method ini adalah menggeser posisi
        // node yang terletak di indeks dan node tersebut berpindah
        // satu indeks setelahnya
       // Node ndInput = new Node(input, null); tidak perlu
        if(index < 0){
            System.out.println("Perbaiki logikanya!" + "Kalau indeksnya -1 bagaimana?");
        } else if(index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for(int i = 0; i<index-1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            // jika diurai sperti dibawah ini:
            // Node ndInput = new Node(input, null);
            // ndInput.next = temp.next;
            // temp.next = ndInput;

            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }

    int getSize(){
        int count = 0;
        Node tmp = head;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        System.out.println(count);
        return count;
    }

    int getData(int index){
        // if (index < 0 ) {
        // System.out.println("index tidak boleh negatif");
        // return;
        //  } else if(index>getSize()-1){
        //     System.out.println("index max = " + getSize()-1);
        //     return;
        //  } else {
        Node tmp = head;
        for (int i = 0; i < index; i++){ //syarat i<index karena kebanyakan tempatnya tidak pas
            tmp = tmp.next;
         }
        return tmp.data; //langsung tmp.data
    //}
    }
    
    int indexOf(int key){
        // ketahui posisi node ada di index mana
        Node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if(tmp == null){
            return -1; //return -1, klo == null
        } else {
            return index;
        }
    }

    void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong" + "Tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong," + "Tidak dapat dihapus");
        } else if(head == tail){ // ==
            head = tail = null;
        } else {
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int key){
        if(isEmpty()){
            System.out.println("Linked list masih kosong," + "Tidak dapat dihapus");
        } else {
            Node temp = head;
            while(temp!=null){
                if(temp.data == key && temp == head){ //temp.data == key
                    removeFirst();
                    break;
                } else if(temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index){
        if (index == 0){
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

}
