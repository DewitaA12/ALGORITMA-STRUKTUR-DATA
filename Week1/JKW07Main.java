import java.util.Scanner;

public class JKW07Main {
     public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.print("Pilih Rumus (1/2/3) : ");
        double rumus = sc7.nextDouble();

        if (rumus == 1) {
            System.out.print("Masukkan jarak (s) : ");
            double s = sc7.nextDouble();
            System.out.print("Waktu (t) : ");
            double t = sc7.nextDouble();
            ProgramJKW07 menu = new ProgramJKW07(0, s, t);
            double hasil = menu.hitungKecepatan();
            System.out.print("Kecepatan: " + hasil);
        } else if (rumus == 2) {
            System.out.print("Masukkan kecepatan (v) : " ); 
            double v = sc7.nextDouble();
            System.out.print("Waktu (t) : ");
            double t = sc7.nextDouble();
            ProgramJKW07 menu = new ProgramJKW07(v, 0, t);
            double hasil = menu.hitungJarak();
            System.out.print("Jarak: " + hasil);
        } else {
            System.out.print("Masukkan jarak (s) : ");
            double s = sc7.nextDouble();
            System.out.print("Masukkan kecepatan (v) : " );
            double v = sc7.nextDouble();
            ProgramJKW07 menu = new ProgramJKW07(v, s, 0);
            double hasil = menu.hitungWaktu();
            System.out.print("Waktu: " + hasil);
        }
        sc7.close();
    }
}
