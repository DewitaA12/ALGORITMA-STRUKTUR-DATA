package Week7.TestSearching;

public class PencarianBuku07 {
    Buku07 listBk[] = new Buku07[5];
    int idx;

    void tambah(Buku07 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        }else {
            System.out.println("Data sudah penuh !");
        }
    }

    void tampil() {
        for (Buku07 m : listBk) {
            m.tampilDataBuku07();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = 0;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku==cari){
                j = posisi;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos){
        if (pos!= -1) {
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }
}
