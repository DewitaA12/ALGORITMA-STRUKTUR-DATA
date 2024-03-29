package Week6;

public class Hotel07Service {
    Hotel07 rooms[] = new Hotel07[5]; 
    int idx;
    
    void tambah(Hotel07 H){
        if (idx < rooms.length){
            rooms[idx] = H;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampilAll (){
        for(Hotel07 H : rooms){
            H.tampilAll();
            System.out.println("-------------------------");
        }
    }

    void bubbleSortPrice(){
        for(int idx = 0; idx<rooms.length-1;idx++){
            for(int j=1; j<rooms.length-idx;j++){
                if(rooms[j].harga < rooms[j-1].harga){
                    Hotel07 tmp = rooms[j];
                rooms[j] = rooms[j-1];
                rooms[j-1] = tmp;
                }
            }
        }
    }

    void selectionSortPrice() {
        for(int idx=0; idx<rooms.length-1; idx++){
            int idxMin = idx;
            for(int j=idx+1; j<rooms.length; j++ ){
                if(rooms[j].harga < rooms[idxMin].harga){
                    idxMin = j;
                }
            }

            //swap
            Hotel07 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[idx];
            rooms[idx] = tmp;
        }
    }

    void bubbleSortRating(){
        for(int idx = 0; idx<rooms.length-1;idx++){
            for(int j=1; j<rooms.length-idx;j++){
                if(rooms[j].bintang < rooms[j-1].bintang){
                    Hotel07 tmp = rooms[j];
                rooms[j] = rooms[j-1];
                rooms[j-1] = tmp;
                }
            }
        }
    }

    void selectionSortRating() {
        for(int idx=0; idx<rooms.length-1; idx++){
            int idxMin = idx;
            for(int j=idx+1; j<rooms.length; j++ ){
                if(rooms[j].bintang < rooms[idxMin].bintang){
                    idxMin = j;
                }
            }

            //swap
            Hotel07 tmp = rooms[idxMin];
            rooms[idxMin] = rooms[idx];
            rooms[idx] = tmp;
        }
    }

}
