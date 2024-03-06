import java.util.ArrayList;

class Mobil07{
    String nama;
    public int c2;
    public int hargaBeli;
    public int thnProduksi;

public Mobil07(String nm, int cc, int hb, int tp){
        this.nama = nm;
        this.c2 = cc;
        this.hargaBeli = hb;
        this.thnProduksi = tp;

}
    
    public double hitungPajak(){
        if ( c2 > 1500) {
            return hargaBeli*0.10;
        }else {
            return hargaBeli*0.075;
        }
    }

    public double hitungBiayaPerawatan(){
        if (thnProduksi < 2010){
            return hargaBeli*0.08;
        }else {
            return hargaBeli*0.05;
        }
    }

    public double hitungBiayaTotal() {
        double pajak = hitungPajak();
        double biayaPerawatan = hitungBiayaPerawatan();
        return pajak + biayaPerawatan;
    }

    public int cc(){
        return c2;
    }

    public int thnProduksi(){
        return thnProduksi;
    }


    public String printData(){
         return "Merk: " + nama + ", Harga Beli: " + hargaBeli + ", CC: " + c2 + ", Tahun Produksi: " + thnProduksi;
    }
}
public class Mobil07Main {
    public static void main(String[] args) {
        ArrayList<Mobil07> mobilList = new ArrayList<>();
        mobilList.add(new Mobil07("MCLAREN", 2000, 30000, 2024));
        mobilList.add(new Mobil07("TOYOTA", 1500, 8000, 2014));
        mobilList.add(new Mobil07("CHERRY", 1200, 5000, 2004));

        double totalBiayaPerawatan = 0;
        int mobilThnLebih2010 = 0;
        for (Mobil07 mobil : mobilList) {
            if (mobil.thnProduksi() > 2010) {
                totalBiayaPerawatan += mobil.hitungBiayaPerawatan();
                mobilThnLebih2010++;
            }
        }

        double rataBiayaPerawatan = totalBiayaPerawatan / mobilThnLebih2010;
        System.out.println("Rata-rata biaya perawatan mobil tahun produksi > 2010: " + rataBiayaPerawatan);

        double maxBiayaTotal = 0;
        Mobil07 mobilTermahal = null;
        for (Mobil07 mobil : mobilList) {
            if (mobil.cc() > 1500 && mobil.thnProduksi() < 2010) {
                double biayaTotal = mobil.hitungBiayaTotal();
                if (biayaTotal > maxBiayaTotal) {
                    maxBiayaTotal = biayaTotal;
                    mobilTermahal = mobil;
                }
            }
        }
        
        if (mobilTermahal != null) {
            System.out.printf("Mobil dengan biaya total termahal:%n%s%n dengan biaya total sebesar %.2f%n", mobilTermahal.printData(), maxBiayaTotal);
        } else {
            System.out.println("Tidak ada mobil yang memenuhi kriteria.");
        }
    }
}