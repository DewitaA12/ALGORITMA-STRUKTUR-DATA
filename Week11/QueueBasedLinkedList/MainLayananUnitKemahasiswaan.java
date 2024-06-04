package Week11.QueueBasedLinkedList;

import java.util.Scanner;

public class MainLayananUnitKemahasiswaan {
    public static void main(String[] args) {
        AntrianMahasiswa antrian = new AntrianMahasiswa();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    scanner.nextLine(); // newline
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    Mahasiswa mahasiswaBaru = new Mahasiswa(nim, nama);
                    antrian.tambahMahasiswa(mahasiswaBaru);
                    break;
                case 2:
                    Mahasiswa mahasiswa = antrian.layaniMahasiswa();
                    if (mahasiswa != null) {
                        System.out.println("Mahasiswa yang dilayani: " + mahasiswa);
                    }
                    break;
                case 3:
                    antrian.lihatAntrian();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
    
}
