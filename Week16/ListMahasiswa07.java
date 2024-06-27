package Week16;

import java.util.ArrayList;
import java.util.List; // tambahkan import untuk List

public class ListMahasiswa07 {

    private List<Mahasiswa07> mahasiswas = new ArrayList<>(); 
    public static void main(String[] args) {
        ListMahasiswa07 lm = new ListMahasiswa07(); // buat objek ListMahasiswa07

        // contoh penggunaan
        Mahasiswa07 mhs1 = new Mahasiswa07("201234", "Noureen", "021xx1");
        Mahasiswa07 mhs2 = new Mahasiswa07("201235","Akhleema", "021xx2");
        Mahasiswa07 mhs3 = new Mahasiswa07("201236","Shannum", "021xx3");

        lm.tambah(mhs1, mhs2, mhs3); // tambahkan mahasiswa
        lm.tampil(); // tampilkan daftar mahasiswa

        lm.update(lm.linearSearch("201235"), new Mahasiswa07("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }

    public void tambah(Mahasiswa07... mahasiswa) {
        for (Mahasiswa07 mhs : mahasiswa) {
            mahasiswas.add(mhs);
        }
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa07 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i =0; i < mahasiswas.size(); i++){
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }
}
