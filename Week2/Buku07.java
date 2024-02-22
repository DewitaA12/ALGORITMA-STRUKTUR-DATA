public class Buku07 {

        String judul, pengarang;
        int halaman, stok, harga;

        public Buku07() {

        }
        
        public Buku07(String jud, String pg, int hal, int stok, int har){
            judul = jud;
            pengarang = pg;
            halaman = hal;
            this.stok = stok;
            harga = har;
        }
        void tampilInformasi() {

            System.out.println("Judul: " + judul);
            System.out.println("Pengarang: " + pengarang);
            System.out.println("Jumlah halaman: " + halaman);
            System.out.println("Sisa stok: " + stok);
            System.out.println("Harga: Rp " + harga);

        }
        void tampilInformasi(int jml) {
            tampilInformasi(); // Memanggil method tampilInformasi() yang sudah ada
        
            int hargaTotal = hitungHargaTotal(jml);
            int diskon = hitungHargaDiskon(jml);
            int hargaBayar = hitungHargaBayar(jml);
        
            System.out.println("Harga total: Rp " + hargaTotal);
            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Harga yang harus dibayar: Rp " + hargaBayar);
        }


        void terjual(int jml) {
            if ( stok > 0 && stok >= jml ){
                stok -= jml;
                hitungHargaTotal(jml);
            }else {
                System.out.println("Stok habis");
            }
        }

        void restock(int jml) {
            stok += jml;
        }

        void gantiHarga (int hrg) {
            harga = hrg;
        }

        int hitungHargaTotal(int jml){
            return harga*jml;
        }

        int hitungHargaDiskon(int jml){
            int diskon = 0;
            int hargaTotal = hitungHargaTotal(jml);
            if ( hargaTotal >= 150000){
                diskon = (int) (0.12*hargaTotal);
            }else if (
                hargaTotal < 150000 && hargaTotal >= 750000
            )
                diskon = (int)(0.05*hargaTotal);
            else 
            diskon = 0;
            return diskon;
            
        }

        int hitungHargaBayar(int jml){
            int hargaTotal = hitungHargaTotal(jml);
            int diskon = hitungHargaDiskon(jml);
            return hargaTotal-diskon;
        }
    }

 