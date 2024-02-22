import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung nilai akhir");
        System.out.println("===============================");
        
        // Deklarasi variabel
        int tugas, kuis, uts, uas;
        double nilaiAkhir;
        String nilaiHuruf;
        
        // Input nilai
        System.out.print("Nilai Tugas : ");
        tugas = sc.nextInt();
        if (tugas < 0 || tugas > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }
        
        System.out.print("Nilai Kuis : ");
        kuis = sc.nextInt();
        if (kuis < 0 || kuis > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }
        
        System.out.print("Nilai UTS : " );
        uts = sc.nextInt();
        if (uts < 0 || uts > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }
        
        System.out.print("Nilai UAS : ");
        uas = sc.nextInt();
        if (uas < 0 || uas > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }
        
        // Menghitung nilai akhir
        nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
        
        // Menentukan nilai huruf
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        
        // Output nilai akhir dan nilai huruf
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("Nilai Akhir = " + nilaiAkhir);
        System.out.println("Nilai Huruf = " + nilaiHuruf);
        System.out.println("===============================");
        System.out.println("===============================");
        
        // Output kelulusan
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") ||
                nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
            System.out.println("TIDAK LULUS");
        }
        
        sc.close();
    }
}
