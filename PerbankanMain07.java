import java.util.Scanner;

public class PerbankanMain07 {

    
    public static void menu() {
        System.out.println("Pilih menu : ");
        System.out.println("1. Masukkan/tambahkan data Rekening");
        System.out.println("2. Tampilkan semua data Rekening");
        System.out.println("3. Urutan data Rekening berdasarkan saldo (DESCENDING)");
        System.out.println("4. Cek data Rekening yang memiliki saldo < 50000");
        System.out.println("5. Cari data Rekening berdasarkan kata kunci nama");
        System.out.println("6. Tarik dari Rekening untuk sejumlah uang tertentu");
        System.out.println("7. Setor ke Rekening untuk sejumlah uang tertentu");
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemPerbankan07 data = new SistemPerbankan07();
        Rekening07 R1 = new Rekening07("16030927 3084", "Wallace", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu", 1000);
        Rekening07 R2 = new Rekening07("16100617 0573", "Darius", "1-357-843-0547", "nec@tacitisociosqu.org", 7000);
        Rekening07 R3 = new Rekening07("16240401 2243", "Fuller", "571-7062", "convallis@tacitisociosqu.org", 5000);
        Rekening07 R4 = new Rekening07("16270525 0112", "Malcolm", "623-0234", "portitor.telus.non@tacitisociosqu.ca", 44000);
        Rekening07 R5 = new Rekening07("16971204 2416", "Goeffrey", "1-683-416-8323", "ut.pellentesque@tacitisociosqu.com", 50000);
        Rekening07 R6 = new Rekening07("16100727 8862", "Rudyard", "650-5379", "proin.eget@tacitisociosqu.ca", 123000);
        Rekening07 R7 = new Rekening07("16460329 4259", "Troy", "897-7608", "pede.suspendies.dui@tacitisociosqu.ca", 100000);
        Rekening07 R8 = new Rekening07("16320421 3437", "Alec", "792-4447", "non@tacitisociosqu.com", 34000);
        Rekening07 R9 = new Rekening07("16180729 7229", "Waiter", "863-8209", "pellentesque@tacitisociosqu.ca", 334544);
        Rekening07 R10 = new Rekening07("16950313 6823", "Simon", "592-6919", "tellus@tacitisociosqu.net", 23444);
        Rekening07 R11 = new Rekening07("16850708 3528", "Kamal", "1-115-339-7678", "dictum@tacitisociosqu.edu", 567770);
        //R12 merupakan data tambahan baru
        Rekening07 R12 = new Rekening07("123456 7890", "Dewita", "08979876899", "scltzhnx@mail.com", 9999999);

        int posisi, pilih;

        data.tambah(R1);
        data.tambah(R2);
        data.tambah(R3);
        data.tambah(R4);
        data.tambah(R5);
        data.tambah(R6);
        data.tambah(R7);
        data.tambah(R8);
        data.tambah(R9);
        data.tambah(R10);
        data.tambah(R11);
        
        
        do {
            menu();
            System.out.print("Pilihan 1/2/3/4/5 : ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1 :
                data.tambah(R12);
                System.out.println("No. Rekening \t= " + R12.noRek);
                System.out.println("Nama \t\t= " + R12.nama);
                System.out.println("Telefon \t= " + R12.telefon);
                System.out.println("Email \t\t= " + R12.email);
                System.out.println("Saldo \t\t= " + R12.saldo);
                System.out.println("Data R12 Berhasi Ditambahkan");
                 break;
                 case 2 :
                // System.out.println("2. Tampilkan semua data Rekening");
                System.out.println("DAFTAR DATA REKENING");
                 data.tampilAll();
                 break;
                 case 3 :
                // System.out.println("3. Urutan data Rekening berdasarkan saldo (DESCENDING)");
                System.out.println("DATA REKENING TERURUT DESCENDING");
                 data.bubbleSortSaldoDESC();
                 data.tampilAll();
                 break;
                 case 4 :
                // System.out.println("4. Cek data Rekening yang memiliki saldo < 50000");
                System.out.println("DATA SALDO < 50000");
                 data.TampilDataSaldoUnder50000();
                 break;
                 case 5 :
                // System.out.println("5. Cari data Rekening berdasarkan kata kunci nama");
                System.out.println("PENCARIAN BERDASARKAN NAMA");
                posisi = data.SequentialSearch("Waiter");
                data.Tampilposisi("Waiter", 8);
                data.TampilData("Waiter", 8);
         
                 break;
                //  case 6 :
                //  //belum bisa
                //  break;
                //  case 7 :
                //  //belum bisa
                //  break;


    }

        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4|| pilih == 5);
        sc.close();
    }
}