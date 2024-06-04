package Week9.Tugas;

public class QueuePembeli {
    Pembeli[] antrian;
        int front;
        int rear;
        int size;
        int max;
    
        public QueuePembeli(int n) {
            max = n;
            antrian = new Pembeli[max];
            size = 0;
            front = 0;
            rear = -1;
        }
    
         public boolean IsEmpty() {
            return size == 0;
         }
    
         public boolean IsFull() {
            return size == max;
         }
    
         public void peek() {
            if (!IsEmpty()) {
                System.out.println("Antrian terdepan : " + antrian[front].nama + 
                " " + antrian[front].noHP);
            } else {
                System.out.println("Antrian masih kosong");
            }
         }
    
         public void print() {
            if (IsEmpty()) {
                System.out.println("Antrian masih kosong");
            } else {
                int i = front;
                while (i != rear) {
                    System.out.println(antrian[i].nama + " " + antrian[i].noHP );
                    i = (i+1) % max;
                }
                System.out.println(antrian[i].nama + " " + antrian[i].noHP );
                System.out.println("Jumlah antrian = " + size);
            }
         }
    
         public void clear() {
            if (!IsEmpty()) {
                front =0; 
                rear = -1;
                size = 0;
                System.out.println("Queue berhaasil dikosongkan");
            } else {
                System.out.println("Queue masih kosong");
            }
         }
    
      
        public void Enqueue(Pembeli pb) {
            if (IsFull()) {
                System.out.println("Antrian sudah penuh");
            } else {
                rear = (rear + 1) % max;
                antrian[rear] = pb;
                size++;
            }
        }
    
      
        public Pembeli Dequeue() {
            Pembeli dt = null;
            if (IsEmpty()) {
                System.out.println("Queue masih kosong (Queue Underflow)");
            } else {
                dt = antrian[front];
                front = (front + 1) % max;
                size--;
            }
            return dt;
        }

        public void peekRear() {
            if (!IsEmpty()) {
                System.out.println("Antrian terbelakang : " + "\nNama \t:" + antrian[rear].nama 
                + "\nNo. HP \t:" + antrian[rear].noHP);
            } else {
                System.out.println("Antrian masih kosong");
            }
        }
        

        
        public void peekPosition(String nama) {
            boolean found = false;
            if (IsEmpty()) {
                System.out.println("Antrian masih kosong");
            } else {
                for (int i = 0; i < size; i++) {
                    int index = (front + i) % max;
                    if (antrian[index].nama.equals(nama)) {
                        System.out.println(nama + " ditemukan pada posisi " + (index + 1));
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println(nama + " tidak ditemukan dalam antrian");
                }
            }
        }

        
        public void daftarPembeli() {
            if (IsEmpty()) {
                System.out.println("Antrian masih kosong");
            } else {
                int i = front;
                System.out.println("Daftar Pembeli:");
                do {
                    System.out.println("Nama \t :" + antrian[i].nama + "\nNo. HP \t :" 
                    + antrian[i].noHP );
                    i = (i + 1) % max;
                } while (i != (rear + 1) % max);
                System.out.println("Jumlah elemen = " + size);
            }
        }

          //  public void Enqueque(Pembeli pb) {
        //     if (IsFull()) {
        //         System.out.println("Antrian sudah penuh");
        //         System.exit(1); // Queue overflow exit program
        //     } else {
        //         if (IsEmpty()) {
        //             front = rear = 0;
        //         } else {
        //             if (rear == max - 1) {
        //                 rear = -1;
        //             } else {
        //                 rear++;
        //             }
        //         }
        //         antrian[rear] = pb;
        //         size++;
        //     }
        //  }

          //  public Pembeli Dequeue() {
        //     Pembeli dt = new Pembeli();
        //     if (IsEmpty()) {
        //         System.out.println("Queue masih kosong (Queue Underflow)");
        //         System.exit(1);
        //     } else {
        //         dt = antrian[front] ;
        //         size--;
        //         if (IsEmpty()) {
        //             front = rear = -1;
        //         } else {
        //             if (front == max) {
        //                 front = 0;
        //             } else {
        //                 front++;
        //             }
        //         }
        //     }
        //     return dt;
        //  }

        //  public void peekPosition(String nama) {
        //     boolean found = false;
        //     if (IsEmpty()) {
        //         System.out.println("Antrian masih kosong");
        //     } else {
        //         for (int i = front; i < rear; i++) {
        //         if (antrian[i].nama.equals(nama)) {
        //             System.out.println("Ditemukan pada antrian");
        //             found = true;
        //             break;
        //         }
        //         }
        //         if (!found) {
        //         System.out.println(nama + " tidak ditemukan dalam antrian");
        //         }
        //     }
        // }

        // public void daftarPembeli() {
        //     if (IsEmpty()) {
        //         System.out.println("Antrian masih kosong");
        //     } else {
        //         int i = front;
        //         System.out.println("Daftar Pembeli:");
        //         do {
        //             System.out.println("Nama \t :" + antrian[i].nama + "\nNo. HP \t :" + antrian[i].noHP );
        //             i = (i+1) % max;
        //         } while (i != rear);
        //         System.out.println("Nama \t :" + antrian[i].nama + "\nNo. HP \t :" + antrian[i].noHP );
        //         System.out.println("Jumlah elemen = " + size);
            
        // }

         // if (size == 0) {
            //     return true;
            // } else {
            //     return false;
            // }

              // if (size == max) {
            //     return true;
            // } else {
            //     return false;
            // }
    }
        
