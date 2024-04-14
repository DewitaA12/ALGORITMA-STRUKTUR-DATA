package Week8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Custom Kapasitas Gudang : ");
        int cap = scanner.nextInt();
        Gudang07 gudang = new Gudang07(cap);
        int kode, kodeBarang;
        String nama, namaBarang;
        
        while (true) {
            System.out.println("\n Menu :");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi : ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    nama = scanner.nextLine();
                    kodeBarang = kode;
                    namaBarang = nama;
                    System.out.print("Masukkan nama kategori : ");
                    String kategori = scanner.nextLine();
                    Barang07 barangBaru = new Barang07(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2 :
                    gudang.ambilBarang();
                    break;
                case 3 :
                    gudang.tampilkanBarang();
                    break;
                case 4 :
                    gudang.lihatBarangTeratas();
                    break;
                case 5 :
                    gudang.lihatBarangTerbawah();
                    break;
                case 6 :
                    System.out.print("Masukkan kode barang yang ingin dicari : ");
                    kodeBarang = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang yang ingin dicari : ");
                    namaBarang = scanner.nextLine();
                    gudang.cariBarang( scanner, kodeBarang, namaBarang);
                    break;
                case 7 :
                    System.out.println("Keluar dari sistem...");
                    System.exit(0);
                    break;
                default :
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } 
    }
}

