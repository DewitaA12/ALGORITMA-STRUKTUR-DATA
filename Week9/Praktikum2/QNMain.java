package Week9.Prakitkum2;
import java.util.Scanner;

public class QNMain {
    
        public static void menu() {
            System.out.println("Pilih menu : ");
            System.out.println("1. Antrian baru");
            System.out.println("2. Antrian keluar");
            System.out.println("3. Cek Antrian Terdepan");
            System.out.println("4. Cek Semua Antrian");
            System.out.println("5. Cek Antrian Belakang");
            System.out.println("---------------------");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan kapasitas queue : ");
            int jumlah = sc.nextInt();
            QueueNasabah antri = new QueueNasabah(jumlah);
            int pilih;

            do {
                menu();
                System.out.print("Pilihan 1/2/3/4/5 : ");
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                    System.out.print("No Rekening : ");
                    String norek = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo : ");
                    double saldo = sc.nextDouble();
                    Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                    sc.nextLine();
                    antri.Enqueque(nb);
                    break;
                    case 2:
                    Nasabah data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                    && data.umur !=0 && data.saldo !=0) {
                        System.out.println("Antrian yang keluar : " + data.norek + " " + data.nama + " " 
                        + data.alamat + " " + data.umur + " " + data.saldo);

                        break;
                    }
                    case 3:
                    antri.peek();
                    break;
                    case 4:
                    antri.print();
                    break;
                    case 5:
                    antri.peekRear();
                    break;
                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
            sc.close();
        }
        }
    
