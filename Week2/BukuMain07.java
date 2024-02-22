public class BukuMain07 {
    public static void main(String[] args) {
        Buku07 bk1 = new Buku07();
        bk1.judul = "Today Ends Tomorrow Comes ";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
// diatas itu kurang bagus bagusan pakai method aksesnya
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();


        Buku07 bk2 = new Buku07("Self Reward", "Maheera Ayesha ",160,29,59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku07 bukuDewita = new Buku07("Heaven", "Dewita", 200, 29, 120000);
        bukuDewita.terjual(10);
        bukuDewita.tampilInformasi(10);

    }
}
