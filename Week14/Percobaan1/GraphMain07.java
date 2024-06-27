package Week14.Percobaan1;
import java.util.Scanner;

public class GraphMain07 {
    public static void main(String[] args) throws Exception {
        Graph07 gedung = new Graph07(6);
    
    gedung.addEdge(0, 1, 50);
    gedung.addEdge(0, 2, 100);
    gedung.addEdge(1, 3, 70);
    gedung.addEdge(2, 3, 40);
    gedung.addEdge(3, 4, 60);
    gedung.addEdge(4, 5, 80);
    gedung.degree(0);
    // System.out.println("Hasil running pada langkah ke 14");
    // gedung.printGraph07();

    gedung.removeEdge(1,3);
    // System.out.println("Hasil running pada langkah ke 17");
    // gedung.printGraph07();


   Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan node asal (0-5): ");
    int asal = scanner.nextInt();
    System.out.print("Masukkan node tujuan (0-5): ");
    int tujuan = scanner.nextInt();

    if (gedung.hasPath(asal, tujuan)) {
        System.out.println("Terdapat jalur dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan));
    } else {
        System.out.println("Tidak terdapat jalur dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan));
    }

    
}

    }

