package Week7.TestSearching;

public class Buku07 {
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

public Buku07(int k, String j, int t, String p, int s) {
    kodeBuku = k;
    judulBuku = j;
    tahunTerbit = t;
    pengarang = p;
    stock = s;
}

public void tampilDataBuku07(){
    System.out.println("=======================");
    System.out.println("Kode buku : " + kodeBuku);
    System.out.println("Judul buku : " + judulBuku);
    System.out.println("Tahun Terbit : " + tahunTerbit);
    System.out.println("Peangarang : " +pengarang);
    System.out.println("Pengarang : " + pengarang);
    System.out.println("Stock : " + stock);
}

}
