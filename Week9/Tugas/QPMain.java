package Week9.Tugas;
import java.util.Scanner;

public class QPMain {
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terbelakang");
        System.out.println("4. Cek Posisi Antrian Pembeli");
        System.out.println("5. Cek Daftar Pembeli");
        System.out.println("6. Keluar");
        System.out.println("---------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian : ");
        int jumlah = sc.nextInt();
        QueuePembeli antrian = new QueuePembeli(jumlah);
        int pilih;

        do {
            menu();
            System.out.print("Pilihan 1/2/3/4/5/6 : ");
            pilih = sc.nextInt();
            sc.nextLine(); // membersihkan input buffer
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("No. HP : ");
                    String noHP = sc.nextLine();
                    sc.nextLine(); // membersihkan input buffer
                    Pembeli pb = new Pembeli(nama, noHP);
                    antrian.Enqueue(pb);
                    System.out.println("Antrian berhasil ditambahkan");
                    break;
                case 2:
                    Pembeli data = antrian.Dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang keluar : " + data.nama + " " + data.noHP);
                    }
                    break;
                case 3:
                    antrian.peekRear();
                    break;
                case 4:
                    System.out.print("Masukkan nama : ");
                    nama = sc.nextLine();
                    antrian.peekPosition(nama);
                    break;
                case 5:
                    antrian.daftarPembeli();
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih != 6);
        sc.close();
    }
}

// public class QPMain {
//     public static void menu() {
//         System.out.println("Pilih menu : ");
//         System.out.println("1. Antrian Baru");
//         System.out.println("2. Antrian Keluar");
//         System.out.println("3. Cek Antrian Terbelakang");
//         System.out.println("4. Cek Posisi Antrian Pembeli");
//         System.out.println("5. Cek Daftar Pembeli");
//         System.out.println("---------------------");
//     }
    

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Masukkan kapasitas antrian : ");
//         int jumlah = sc.nextInt();
//         QueuePembeli antrian = new QueuePembeli(jumlah);
//         int pilih;

//         do {
//             menu();
//             System.out.print("Pilihan 1/2/3/4/5 : ");
//             pilih = sc.nextInt();
//             switch (pilih) {
//                 case 1:
//                 System.out.print("Nama : ");
//                 String nama = sc.nextLine();
//                 sc.nextLine();
//                 System.out.print("No. HP : ");
//                 int noHP = sc.nextInt();
            
//                 Pembeli pb = new Pembeli( nama, noHP);
//                 sc.nextLine();
//                 antrian.Enqueque(pb);
//                 System.out.println("Antrian berhasil ditambahkan");
//                 break;
//                 case 2:
//                 Pembeli data = antrian.Dequeue();
//                 if (!"".equals(data.nama) && (data.noHP) !=0 ) {
//                     System.out.println("Antrian yang keluar : " + data.nama + " " + data.noHP );
//                     break;
//                 }
//                 case 3:
//                 antrian.peekRear();
//                 break;
//                 case 4:
//                 System.out.println("Masukkan nama : ");
//                 nama = sc.nextLine();
//                 antrian.peekPosition(nama);
//                 int position = 0;
//                 if (position != -1) {
//                     System.out.println(nama + "berada di posisi " + (position + 1) + " dalam antrian");
//                 } else {
//                     System.out.println(nama + "tidak ditemukan dalam antrian");
//                 }
//                 break;
//                 case 5:
//                 antrian.daftarPembeli();
//                 break;
//             }
//         } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
//         sc.close();
//         }
// }
