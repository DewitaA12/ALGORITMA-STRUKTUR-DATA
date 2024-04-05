package Week7.TestSearching;
import java.util.Scanner;

public class BukuMain07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        Scanner s1 = new Scanner(System.in);

        PencarianBuku07 data = new PencarianBuku07();
        int jumBuku07 = 5;

        System.out.println("---------------------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jumBuku07 ; i++) {
            System.out.println("---------------------------------------------------------");
            System.out.print("Kode buku \t : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock     \t : ");
            int stock = s.nextInt();

            Buku07 m = new Buku07(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println();
        System.out.println("=======================");
        System.out.println("DATA KESELURUHAN BUKU ");
        System.out.println("=======================");
        data.tampil();

        System.out.println("____________________________________");
        System.out.println("PENCARIAN DATA : ");
        System.out.println("____________________________________");
        System.out.println("Masukkan kode buku yang dicari : ");
        System.out.print("Kode buku : ");
        String cari = s1.nextLine();

        System.out.println("Menggunakan SEQUENTIAL SEARCH");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        /*Buku07 dataBuku07 = data.findBuku(cari);
        dataBuku07.tampilDataBuku07();
        s.close();
        s1.close();*/
        
        System.out.println("=============================");
        System.out.println("Menggunakan BINARY SEARCH");
        posisi = data.FindBinarySearch(cari,0, jumBuku07 - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("MENCARI JUDUL BUKU ");
        System.out.println("Masukkan judul yang dicari : ");
        String cariJudul = s1.nextLine();

        System.out.println("Sequential Search");
        data.sortJudul();
        int posisiJudul = data.findSeqSearchJudul(cariJudul);
        data.Tampilposisi(cariJudul, posisi);
        data.tampilDataBuku(cariJudul);

        System.out.println("Binary Search");
        data.sortJudul();
        posisiJudul = data.findBinSearchJudul(cariJudul);
        data.Tampilposisi(cariJudul, posisi);
        data.tampilDataBuku(cariJudul);

        s.close();
        s1.close(); 

    }
    
}
