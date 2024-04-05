package Week7.TestSearching;

public class Buku07 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

public Buku07(String k, String j, int t, String p, int s) {
    this.kodeBuku = k;
    this.judulBuku = j;
    this.tahunTerbit = t;
    this.pengarang = p;
    this.stock = s;
}

public void tampilDataBuku07(){
    System.out.println("=======================");
    System.out.println("Kode buku : " + kodeBuku);
    System.out.println("Judul buku : " + judulBuku);
    System.out.println("Tahun Terbit : " + tahunTerbit);
    System.out.println("Pengarang : " + pengarang);
    System.out.println("Stock : " + stock);
}

}
