import java.util.Scanner;

public class IPsemester {

    public static void main(String[] args) {
        Scanner sc7 = new Scanner(System.in);
        String[] Matkul = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };

        double[] nilaiAngka = new double[Matkul.length];
        int totalSks = 0;
        double totalBobot = 0;
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");
        System.out.print("Masukkan jumlah SKS: ");
        int sks = sc7.nextInt();
        for (int i = 0; i < Matkul.length && i < sks; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + Matkul[i] + " : ");
            double nilai = sc7.nextDouble();
            if (nilai >= 0 && nilai <= 100) {
                double bobot = 0;
                if (nilai > 80) {
                    bobot = 4.0;
                } else if (nilai > 73) {
                    bobot = 3.50;
                } else if (nilai > 65) {
                    bobot = 3.00;
                } else if (nilai > 60) {
                    bobot = 2.50;
                } else if (nilai > 50) {
                    bobot = 2.00;
                } else if (nilai > 39) {
                    bobot = 1.00;
                } else if (nilai > 0) {
                    bobot = 0.00;
                }
                nilaiAngka[i] = nilai;
                totalBobot += bobot;
                totalSks++;
            } else {
                System.out.println("Nilai harus di antara 0 - 100");
                return;
            }
            sc7.close();
        }

        System.out.printf("========================");
        System.out.printf("%n%nHasil Konversi Nilai%n");
        System.out.printf("=======================%n");
        System.out.printf("%-40s%10s%15s%15s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < totalSks; i++) {
            double bobot = 0;
            if (nilaiAngka[i] > 80) {
                bobot = 4.0;
            } else if (nilaiAngka[i] > 73) {
                bobot = 3.50;
            } else if (nilaiAngka[i] > 65) {
                bobot = 3.00;
            } else if (nilaiAngka[i] > 60) {
                bobot = 2.50;
            } else if (nilaiAngka[i] > 50) {
                bobot = 2.00;
            } else if (nilaiAngka[i] > 39) {
                bobot = 1.00;
            } else if (nilaiAngka[i] > 0) {
                bobot = 0.00;
            }
            System.out.printf("%-40s%10s%15s%15s%n", Matkul[i], nilaiAngka[i], convertToNilaiHuruf(nilaiAngka[i]),
                    bobot);
        }
        System.out.printf("%nIP : %.2f%n", totalBobot / totalSks);

    }

    private static String convertToNilaiHuruf(double nilaiSetara) {
        if (nilaiSetara > 80) {
            return "A";
        } else if (nilaiSetara > 73) {
            return "B+";
        } else if (nilaiSetara > 65) {
            return "B";
        } else if (nilaiSetara > 60) {
            return "C+";
        } else if (nilaiSetara > 50) {
            return "C";
        } else if (nilaiSetara > 39) {
            return "D";
        } else if (nilaiSetara > 0) {
            return "E";
        }
        return null; 
        
    }

}
