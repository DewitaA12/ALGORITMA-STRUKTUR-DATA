package Week8;

import java.util.Scanner;

public class Gudang07 {
    Barang07[] tumpukan;
    int size;
    int top;
   
    public Gudang07(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang07[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang07 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang07 ambilBarang() {
        if (!cekKosong()) {
            Barang07 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang07 lihatBarangTeratas() {
        if (!cekKosong()){
            Barang07 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang07 lihatBarangTerbawah() {
        if (!cekKosong()){
            for (int i = top; i >= 0; i--) {
                if (i == 0) {
                    System.out.println("Barang terbawah: " + tumpukan[i].nama);
                    return tumpukan[i];
                }
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
        return null;
    }


    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            // for (int i = top; i >= 0; i--) {}
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi07 stack = new StackKonversi07();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public Barang07 cariBarang(Scanner scanner, int kodeBarang, String namaBarang) {

        if (!cekKosong()) {
            // Linear search 
            for (int i = top; i >= 0; i--) {
                Barang07 barang = tumpukan[i];
    
                // Check by code
                if (barang.kode == kodeBarang) {
                    System.out.println("Barang ditemukan berdasarkan kode: " + barang.nama);
                    return barang;
                }
    
                // Check by name (case-insensitive)
                if (barang.nama.equalsIgnoreCase(namaBarang)) {
                    System.out.println("Barang ditemukan berdasarkan nama: " + barang.kode);
                    return barang;
                }
            }
    
            // Item not found
            System.out.println("Barang tidak ditemukan dengan kode " + kodeBarang + " atau nama " + namaBarang);
            return null;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
}
