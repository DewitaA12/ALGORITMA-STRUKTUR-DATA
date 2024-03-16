package Week5.BruteForceDivideConquer;
import java.util.Scanner;

public class MainShowroom {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        Showroom sr[] = new Showroom[8];

     for (int i = 0; i < sr.length; i++) {
            System.out.print("Merk mobil ke-" + (i + 1) + " = ");
            String m = sc7.nextLine();
            System.out.print("Tipe  = ");
            String typ = sc7.nextLine();
            System.out.print("Tahun Produksi = ");
            String thn = sc7.nextLine();
            System.out.print("Top Acceleration = ");
            int tA = sc7.nextInt();
            System.out.print("Top Power = ");
            int tP = sc7.nextInt();
            sc7.nextLine(); 
            System.out.println();
            sr[i] = new Showroom(m, typ, thn, tA, tP);
        }

        // kalau ingin menampilkan inputan uncomment aja
        // for (int i = 0; i < sr.length; i++) {
        //     System.out.println("Data Mobil ke-" + (i + 1));
        //     System.out.println("Merk : " + sr[i].merk);
        //     System.out.println("Tipe : " + sr[i].tipe);
        //     System.out.println("Tahun Produksi : " + sr[i].tahun);
        //     System.out.println("Top Acceleration : " + sr[i].topAcceleration);
        //     System.out.println("Top Power : " + sr[i].topPower);
        //     System.out.println();
        // }
        
        cariMinMaxAccelerationDC(sr, 0, sr.length -1);
        ratarataTopPowerBF(sr);
        sc7.close();
    }

    // Method untuk mencari top acceleration tertinggi dan terendah menggunakan pendekatan divide and conquer
    public static void cariMinMaxAccelerationDC(Showroom[] sr, int low, int high) {
        int minAcceleration = Integer.MAX_VALUE;
        int maxAcceleration = Integer.MIN_VALUE;
    
        for (int i = low; i <= high; i++) {
            if (sr[i].topAcceleration < minAcceleration) {
                minAcceleration = sr[i].topAcceleration;
            }
            if (sr[i].topAcceleration > maxAcceleration) {
                maxAcceleration = sr[i].topAcceleration;
            }
        }
    
        System.out.println("Top Acceleration Terendah: " + minAcceleration);
        System.out.println("Top Acceleration Tertinggi: " + maxAcceleration);
    }



    // Method untuk mencari rata-rata top power dari seluruh mobil menggunakan pendekatan brute force
    public static void ratarataTopPowerBF(Showroom[] sr) {
    double totalTopPower = 0;
    for (Showroom car : sr) {
        totalTopPower += car.topPower;
    }
    System.out.println("Rata rata top power : " + totalTopPower/sr.length);
}
}
