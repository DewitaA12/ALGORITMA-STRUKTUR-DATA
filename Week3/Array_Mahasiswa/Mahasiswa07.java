package Array_Mahasiswa;
import java.util.Scanner;


public class Mahasiswa07 {
    String nama;
    String jenisKelamin;
    String nim;
    double ipk;

    public Mahasiswa07(String nm, String jk, String ni, double ip) {
        nama = nm;
        jenisKelamin = jk;
        nim = ni;
        ipk = ip;
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
        sc7.close();
    }
}
