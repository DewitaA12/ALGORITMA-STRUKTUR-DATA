public class RoyalGarden07 {
    private static int[][] stockBunga = {
        {0, 10, 5, 15, 7},  // RoyalGarden 1
        {0, 6, 11, 9, 12},  // RoyalGarden 2
        {0, 2, 10, 10, 5},  // RoyalGarden 3
        {0, 5, 7, 12, 9}    // RoyalGarden 4
    };

    private static int[] hargaBunga = {75000, 50000, 60000, 10000}; // Harga Aglonema, Keladi, Alocasia, Mawar

    public static void PendapatanSetiapCabang() {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 1; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j - 1];
            }
            System.out.println("Pendapatan cabang RoyalGarden " + (i + 1) + ": " + pendapatan);
        }
    }

    // Fungsi >> jumlah stok setiap jenis bunga pada suatu cabang
    public static void JumlahStockBunga(String cabang) {
        int index = Integer.parseInt(cabang.split(" ")[1]) - 1;
        System.out.println("Jumlah stok bunga di " + cabang + ":");
        for (int j = 1; j < stockBunga[index].length; j++) {
            System.out.println(NamaBunga(j) + ": " + stockBunga[index][j]);
        }
    }

    public static void kurangiStockBunga(String namaBunga, int jumlah) {
        int index = IndexBunga(namaBunga);
        for (int i = 0; i < stockBunga.length; i++) {
            stockBunga[i][index] -= jumlah;
        }
    }

    public static String NamaBunga(int index) {
        switch (index) {
            case 1:
                return "Aglonema";
            case 2:
                return "Keladi";
            case 3:
                return "Alocasia";
            case 4:
                return "Mawar";
            default:
                return "";
        }
    }

    public static int IndexBunga(String namaBunga) {
        switch (namaBunga) {
            case "Aglonema":
                return 1;
            case "Keladi":
                return 2;
            case "Alocasia":
                return 3;
            case "Mawar":
                return 4;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        
        PendapatanSetiapCabang();

        JumlahStockBunga("RoyalGarden 4");
        
        kurangiStockBunga("Aglonema", 1);
        kurangiStockBunga("Keladi", 2);
        kurangiStockBunga("Alocasia", 0);
        kurangiStockBunga("Mawar", 5);
       
        JumlahStockBunga("RoyalGarden 4");
    }
}
