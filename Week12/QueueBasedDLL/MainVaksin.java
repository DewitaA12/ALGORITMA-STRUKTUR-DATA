package Week12.QueueBasedDLL;
import java.util.Scanner;


public class MainVaksin {
    public static void main(String[] args) {
        AntrianVaksinasi antrian = new AntrianVaksinasi();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    scanner.nextLine(); // newline
                    System.out.println("------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("------------------------------");
                    System.out.print("Nomor Antrian: ");
                    String no = scanner.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = scanner.nextLine();
                    Pasien pasienBaru = new Pasien(no, nama);
                    antrian.tambahPasien(pasienBaru);
                    break;
                case 2:
                    Pasien ps = antrian.hapusDataAntrian();
                    if (ps != null) {
                        System.out.println(ps + " telah selesai divaksinasi.");
                    }
                    break;
                case 3:
                    antrian.daftarAntrian();
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
