
public class SistemPerbankan07 {
    Rekening07 data[] = new Rekening07[11]; 
    int idx;

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
            System.out.println("-------------------------");
        }
    }

    public void bubbleSortSaldoDESC() {
        for (int idx = 0; idx < data.length - 1; idx++) {
          for (int j = 1; j < data.length - idx; j++) {
            if (data[j].saldo > data[j - 1].saldo) { 
              Rekening07 tmp = data[j];
              data[j] = data[j - 1];
              data[j - 1] = tmp;
            }
          }
        }
      }

      public void TampilData() {
        for (int idx = 0; idx < data.length - 1; idx++) {
            for (int j = 1; j < data.length - idx; j++) {
                if (data[j].saldo < 50000) {
                    tampilAll();
                } else {
                    System.out.println("data saldo < 50000 tidak ditemukan");
                
                }
            }
          }
      }

      public int SequentialSearch() {
        int posisi = -1;
        int j=1;
        String nama = data[j].nama;
        for (int idx = 0; idx < data.length - 1; idx++) {
            for (j = 1; j < data.length - idx; j++) {
                if (data[j].nama.equals(nama)){
                    posisi = j;
                    break; 
            }
        }  
    }
    return posisi;
}

}
        
