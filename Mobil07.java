import java.util.Scanner;

class Mobil07{
    String nama;
    int c2;
    int hargaBeli;
    int thnProduksi;

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

public static void main(String[] args) {
    Scanner sc7 = new Scanner(System.in);
    Mobil07 mb[] = new Mobil07[3];

     for (int i = 0; i < mb.length; i++) {
            System.out.print("Merk mobil ke-" + (i + 1) + " = ");
            String nama = sc7.nextLine();
            System.out.print("Harga Beli  = ");
            int hargaBeli = sc7.nextInt();
            System.out.print("CC  = ");
            int c2 = sc7.nextInt();
            System.out.print("Tahun Produksi = ");
            int thnProduksi = sc7.nextInt();
            sc7.nextLine(); 
            System.out.println();
            mb[i] = new Mobil07(nama, hargaBeli, c2, thnProduksi);
        }

    for (int i = 0; i < mb.length; i++) {
            System.out.println("Data Mobil ke-" + (i + 1));
            System.out.println("Merk : " + mb[i].nama);
            System.out.println("Harga Beli : " + mb[i].hargaBeli);
            System.out.println("CC : " + mb[i].c2);
            System.out.println("Tahun Produksi : " + mb[i].thnProduksi);
            System.out.println();
        }

    double totalBiayaPerawatan = 0;
    int mobilThnLebih2010 = 0;
    for (int i = 0; i < mb.length; i++) {
        if (mb[i].thnProduksi > 2010) {
            totalBiayaPerawatan += mb[i].hitungBiayaPerawatan();
            mobilThnLebih2010++;
        }
    }

    double rataBiayaPerawatan = totalBiayaPerawatan / mobilThnLebih2010;
    System.out.println("Rata-rata biaya perawatan mobil tahun produksi > 2010: " + rataBiayaPerawatan);

    double maxBiaya = 0;
    for (int i = 0; i < mb.length; i++) {
        if (mb[i].cc() > 1500 && mb[i].thnProduksi() < 2010) {
            double biayaTotal = mb[i].hitungBiayaTotal();
            if (biayaTotal > maxBiaya) {
                maxBiaya = biayaTotal;
            }
        }
    }
    System.out.println("Mobil termahal dengan cc>1500 && Produksi>2010 : " + maxBiaya);
    sc7.close();
    
}
}

   