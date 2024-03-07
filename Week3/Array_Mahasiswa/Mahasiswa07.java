package Array_Mahasiswa;
import java.util.Scanner;


public class Mahasiswa07 {
    String nama;
    String jenisKelamin;
    String nim;
    double ipk;

    public Mahasiswa07(String nm, String jk, String ni, double ip) {
        this.nama = nm;
        this.jenisKelamin = jk;
        this.nim = ni;
        this.ipk = ip;
    }

    

    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        Mahasiswa07 mh[] = new Mahasiswa07[3]; 

        for (int i = 0; i < mh.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + " = ");
            String nama = sc7.nextLine();
            System.out.print("Masukkan jenis kelamin  = ");
            String jk = sc7.nextLine();
            System.out.print("Masukkan nim  = ");
            String ni = sc7.nextLine();
            System.out.print("Masukkan IPK  = ");
            double ip = sc7.nextDouble();
            sc7.nextLine(); 
            System.out.println();
            mh[i] = new Mahasiswa07(nama, jk, ni, ip);
        }

        for (int i = 0; i < mh.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nama : " + mh[i].nama);
            System.out.println("Nim : " + mh[i].nim);
            System.out.println("Jenis Kelamin : " + mh[i].jenisKelamin);
            System.out.println("Nilai IPK : " + mh[i].ipk);
            System.out.println();
        }

        double averageGPA = calculateAverageGPA(mh);
        System.out.println("Rata-rata IPK: " + averageGPA);
        displayHighestGPAStudent(mh);
        sc7.close();
    }


        private static double calculateAverageGPA(Mahasiswa07[] mh) {
            double totalGPA = 0;
            for (Mahasiswa07 mahasiswa : mh) {
                totalGPA += mahasiswa.ipk;
            }
            return totalGPA / mh.length;
        }

        private static void displayHighestGPAStudent(Mahasiswa07[] mh) {
            Mahasiswa07 highestGPAStudent = mh[0];
            for (int i = 1; i < mh.length; i++) {
                if (mh[i].ipk > highestGPAStudent.ipk) {
                    highestGPAStudent = mh[i];
                }
            }
        
        System.out.println("Mahasiswa dengan IPK tertinggi:");
            System.out.println("Nama: " + highestGPAStudent.nama);
            System.out.println("NIM: " + highestGPAStudent.nim);
            System.out.println("Jenis Kelamin: " + highestGPAStudent.jenisKelamin);
            System.out.println("IPK: " + highestGPAStudent.ipk);
        
}

}
