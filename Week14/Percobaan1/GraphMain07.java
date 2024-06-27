package Week14.Percobaan1;
import java.util.Scanner;

public class GraphMain07 {
    public static void main(String[] args) throws Exception {
        Graph07 gedung = new Graph07(6);

    
//     gedung.addEdge(0, 1, 50);
//     gedung.addEdge(0, 2, 100);
//     gedung.addEdge(1, 3, 70);
//     gedung.addEdge(2, 3, 40);
//     gedung.addEdge(3, 4, 60);
//     gedung.addEdge(4, 5, 80);
//     gedung.degree(0);
//     // System.out.println("Hasil running pada langkah ke 14");
//     // gedung.printGraph07();

//     gedung.removeEdge(1,3);
//     // System.out.println("Hasil running pada langkah ke 17");
//     // gedung.printGraph07();


//    Scanner scanner = new Scanner(System.in);
//     System.out.print("Masukkan node asal (0-5): ");
//     int asal = scanner.nextInt();
//     System.out.print("Masukkan node tujuan (0-5): ");
//     int tujuan = scanner.nextInt();

//     if (gedung.hasPath(asal, tujuan)) {
//         System.out.println("Terdapat jalur dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan));
//     } else {
//         System.out.println("Tidak terdapat jalur dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan));
//     }

Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("Menu Program:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Check Edge");
            System.out.println("6. Exit");
            System.out.print("Pilih menu (1-6): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan node asal (0-5): ");
                    int asal = scanner.nextInt();
                    System.out.print("Masukkan node tujuan (0-5): ");
                    int tujuan = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    System.out.println("Edge ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan node asal (0-5): ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan node tujuan (0-5): ");
                    tujuan = scanner.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    System.out.println("Edge dihapus.");
                    break;
                case 3:
                    System.out.print("Masukkan node yang ingin diperiksa degree-nya (0-5): ");
                    int node = scanner.nextInt();
                    gedung.degree(node);
                    break;
                case 4:
                    gedung.printGraph07();
                    break;
                case 5:
                    System.out.print("Masukkan node asal (0-5): ");
                    asal = scanner.nextInt();
                    System.out.print("Masukkan node tujuan (0-5): ");
                    tujuan = scanner.nextInt();
                    if (gedung.hasPath(asal, tujuan)) {
                        System.out.println("Terdapat jalur dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan));
                    } else {
                        System.out.println("Tidak terdapat jalur dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan));
                    }
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            System.out.println();
        } while (pilihan != 6);
    }
}


