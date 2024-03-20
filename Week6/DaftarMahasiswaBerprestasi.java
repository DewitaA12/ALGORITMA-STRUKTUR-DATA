package Week6;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    
    void tambah(Mahasiswa m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-------------------------");
        }
    }
//i untuk tahap, j untuk langkah
    void bubbleSort(){
        for(int i = 0; i<listMhs.length-1;i++){
            for(int j=1; j<listMhs.length-i;j++){
                if(listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa tmp = listMhs[j];
                listMhs[j] = listMhs[j-1];
                listMhs[j-1] = tmp;
                }
            }
        }
    }
}
