package Week5.BruteForceDivideConquer;
import java.util.Scanner;

public class MainPerusahaan {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc7.nextInt();
        
        Perusahaan[] perusahaan = new Perusahaan[jumlahPerusahaan];
        
        for (int i = 0; i < jumlahPerusahaan; i++) {
            sc7.nextLine(); 
            
            System.out.print("Masukkan nama perusahaan ke-" + (i + 1) + ": ");
            String namaPerusahaan = sc7.nextLine();
            
            System.out.print("Masukkan jumlah bulan keuntungan " + namaPerusahaan + ": ");
            int jumlahBulan = sc7.nextInt();
            
            perusahaan[i] = new Perusahaan(namaPerusahaan, jumlahBulan);
            
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + " untuk perusahaan " + namaPerusahaan + ": ");
                double keuntungan = sc7.nextDouble();
                
                perusahaan[i].setKeuntunganBulanan(j + 1, keuntungan);
            }
        }
        
        System.out.println("\nTotal keuntungan setiap perusahaan (Brute Force):");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan " + perusahaan[i].nama + ": " + perusahaan[i].hitungTotalKeuntunganBruteForce());
        }

        System.out.println("\nTotal keuntungan setiap perusahaan (Divide and Conquer):");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("Perusahaan " + perusahaan[i].nama + ": " + perusahaan[i].hitungTotalKeuntunganDivideConquer());
        }
        
        sc7.close();
}
}
