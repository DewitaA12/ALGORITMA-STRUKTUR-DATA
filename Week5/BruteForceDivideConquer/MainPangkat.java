package Week5.BruteForceDivideConquer;
import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc7.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for(int i=0; i<elemen; i++){
            png[i] = new Pangkat(i, i);
            System.out.println("Masukkan nilai yang hendak dipangkatkan : ");
            png[i].nilai = sc7.nextInt();
            System.out.println("Masukkan nilai pemangkat : ");
            png[i].pangkat = sc7.nextInt();
        }

    System.out.println("1. Brute Force");
    System.out.println("2. Divide Conquer");
    System.out.println("Pilih Metode (1/2) : ");
    int choose = sc7.nextInt();
    switch (choose) {
    case 1 :
        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i=0; i<elemen; i++){
            System.out.println("Hasil dari " 
            + png[i].nilai + " pangkat " 
            + png[i].pangkat + " adalah "
            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        break;
    case 2 : 
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i=0; i<elemen; i++){
            System.out.println("Hasil dari " 
            + png[i].nilai + " pangkat " 
            + png[i].pangkat + " adalah "
            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        break;
        default:
            System.out.println("Pilihan tidak valid.");
    }
        sc7.close();
    }
}
