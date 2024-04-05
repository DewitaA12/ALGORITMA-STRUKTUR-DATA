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

    public int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(String cari, int pos){
        if (pos != -1) {
            System.out.println("data : " + cari + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
    }

    public void TampilData(String cari, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku \t : " + cari);
            System.out.println("Judul     \t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit \t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t : " + listBk[pos].pengarang);
            System.out.println("Stock     \t : " + listBk[pos].stock);
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
    }

    /*public Buku07 findBuku (int cari) {
        Buku07 bukuFound = null;

        for (int i = 0; i < listBk.length; i++) {
            if(listBk[i].kodeBuku == cari) {
                bukuFound = listBk[i];
                break;
            }
        }
        return bukuFound;
    }*/

     public int FindBinarySearch (String cari, int left, int right) {
        while (left <= right) {
            int mid = (right + left) / 2;
            if (cari.equals(listBk[mid].kodeBuku)) {
                return mid;
            }
            if (listBk[left].kodeBuku.compareTo(cari) <= 0 &&
            cari.compareTo (listBk[mid].kodeBuku) <= 0) {
                right = mid - 1; //finding left side
            } else {
                left = mid + 1; //finding right side
            }
        }
        return -1; //data not found
    }
}

