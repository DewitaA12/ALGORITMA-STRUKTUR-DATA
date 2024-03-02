import java.util.Scanner;

public class PlatNomor07 {
    public static void main(String[] args) {
        String[] KODE = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String[][] KOTA = {
            {"Banten", "Jakarta", "Bandung", "Cirebon", "Bogor", "Pekalongan", "Semarang", "Surabaya", "Malang", "Tegal"}
        };

        Scanner sc7 = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor (Kapital): ");
        String kodePlat = sc7.nextLine();

        String namaKota = cariKotaByKode(KODE, KOTA, kodePlat);
        if (namaKota != null) {
            System.out.println("Kota: " + namaKota);
        } else {
            System.out.println("Kode plat nomor tidak valid");
        }
        sc7.close();
    }

        public static String cariKotaByKode(String[] KODE, String[][] KOTA, String kodePlat) {
            for (int i = 0; i < KODE.length; i++) {
                if (KODE[i].equals(kodePlat)) {
                    return KOTA[0][i];
                }
            }
            for (int i = 0; i < KODE.length; i++) {
                if (KODE[i].equals(kodePlat)) {
                    return KOTA[1][i];
                }
            }
            return null;
        }
    }
    