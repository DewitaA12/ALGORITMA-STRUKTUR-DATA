import java.util.Scanner;

public class Mobil07{
    String nama;
    public int c2;
    public int hargaBeli;
    public static int thnProduksi;

public Mobil07(String nm, int cc, int hb, int tp){
    nama = nm;
    c2 = cc;
    hargaBeli = hb;
    thnProduksi = tp;

}
    
    public double hitungPajak(int c2){
        double pajak;
        if ( c2 > 1500) {
            pajak =  0.10*hargaBeli;
        }else {
            pajak = 0.75*hargaBeli;
        }
        return pajak;
    }

    public double hitungBiayaPerawatan(int thnProduksi){
        double biayaPerawatan;
        if (thnProduksi < 2010){
            biayaPerawatan = 0.8*hargaBeli;
        }else {
            biayaPerawatan = 0.5*hargaBeli;
        }
        return biayaPerawatan;
    }

    public double hitungBiayaTotal() {
        double pajak = hitungPajak();
        double biayaPerawatan = hitungBiayaPerawatan();
        return pajak + biayaPerawatan;
    }

    public void printData(){
        System.out.println("Pajak Mobil ke-" +n+ " = Rp. " + mbArray[n].hitungPajak());
        System.out.println("Biaya Perawatan Mobil ke-" +n+ " = Rp. " + mbArray[n].hitungBiayaPerawatan());
        System.out.println("Biaya Total Mobil ke-" +n+ "= Rp. " + mbArray[n].hitungBiayaTotal());
    }
    
    public static void main(String[] args) {
        Mobil07[] mbArray = new Mobil07[n];
        Scanner sc7 = new Scanner(System.in);
        for (int n = 0; n < mbArray.length; n++) {
            System.out.print("Nama Mobil = ");
            String nama = sc7.nextLine();
            System.out.print("CC Mobil = ");
            int c2 = sc7.nextInt();
            System.out.print("Harga Beli = ");
            int hargaBeli = sc7.nextInt();
            System.out.print("Tahun Produksi = ");
            int thnProduksi = sc7.nextInt();
            sc7.nextLine(); 

            mbArray[n] = new Mobil07(nama, c2, hargaBeli, thnProduksi);
        }

        double totalBiayaPerawatan = 0;
        int mobilThnLebih2010 = 0;
        for (int n = 0; n < mbArray.length; n++) {
            if (Mobil07.thnProduksi > 2010) {
                totalBiayaPerawatan += mbArray[n].hitungBiayaPerawatan();
                mobilThnLebih2010++;
            }
        }
        double rataBiayaPerawatan = totalBiayaPerawatan / mobilThnLebih2010;
        System.out.println("Rata-rata biaya perawatan mobil tahun produksi > 2010: " + rataBiayaPerawatan);

        double maxBiayaTotal = mbArray[0].hitungBiayaTotal();
        int maxBiayaTotalIdx = 0;
        for (int n = 1; n < mbArray.length; n++) {
            if (mbArray[n].hitungBiayaTotal() > maxBiayaTotal) {
                maxBiayaTotal = mbArray[n].hitungBiayaTotal();
                maxBiayaTotalIdx = n;
            }
        }
        System.out.println("Max Biaya Total = " + maxBiayaTotal);
            }
        }
                


    
        
        
        
   