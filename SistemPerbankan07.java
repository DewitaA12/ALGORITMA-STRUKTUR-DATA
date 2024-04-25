
public class SistemPerbankan07 {
    Rekening07 data[] = new Rekening07[12]; 
    int idx;
    int j;

    public void tambah(Rekening07 dt){
        if (idx < data.length){
            data[idx] = dt;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    public void tampilAll(){
        for(Rekening07 dt : data){
            dt.tampilAll();
            System.out.println("-------------------------------------------------");
        }
    }
    

    public void bubbleSortSaldoDESC() {
        for (idx = 0; idx < data.length - 1; idx++) {
          for ( j = 1; j < data.length - idx; j++) {
            if (data[j].saldo > data[j - 1].saldo) { 
              Rekening07 tmp = data[j];
              data[j] = data[j - 1];
              data[j - 1] = tmp;
            }
          }
        }
      }

      public void TampilDataSaldoUnder50000() {
        for (idx = 0; idx < data.length - 1; idx++) {
            for (j = 1; j < data.length - idx; j++) {
                if ( data[j].saldo < 50000) {
                    System.out.println();
                    System.out.println("No. Rekening \t= " + data[j].noRek);
                    System.out.println("Nama \t\t= " + data[j].nama);
                    System.out.println("Telefon \t= " + data[j].telefon);
                    System.out.println("Email \t\t= " + data[j].email);
                    System.out.println("Saldo \t\t= " + data[j].saldo);
                }
            }
            System.exit(0);
          }
      }

      public int SequentialSearch(String cariNama) {
        int posisi = -1;
        int j=1;
        for (int idx = 0; idx < data.length - 1; idx++) {
            for (j = 1; j < data.length - idx; j++) {
                if (data[j].nama.equals(cariNama)){
                    posisi = j;
                    break; 
            }
        }  
    }
    return posisi;
}

    public void Tampilposisi(String cari, int pos){
        if (pos != -1) {
            System.out.println("data : " + cari + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
    }

    public void TampilData(String cari, int pos) {
        if (pos != -1) {
            System.out.println("No. Rekening \t= " + data[j].noRek);
            System.out.println("Nama \t\t= " + data[j].nama);
            System.out.println("Telefon \t= " + data[j].telefon);
            System.out.println("Email \t\t= " + data[j].email);
            System.out.println("Saldo \t\t= " + data[j].saldo);
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
    
}

}
