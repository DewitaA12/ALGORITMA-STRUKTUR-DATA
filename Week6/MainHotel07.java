package Week6;

public class MainHotel07 {
    public static void main(String[] args) {
        Hotel07Service list = new Hotel07Service();
        Hotel07 H1 = new Hotel07("Menara", "Jakarta", 500000, 5.0);
        Hotel07 H2 = new Hotel07("Permata", "Semarang", 400000,  4.0);
        Hotel07 H3 = new Hotel07("Jaya", "Surabaya", 450000, 4.5);
        Hotel07 H4 = new Hotel07("Miracle", "Madiun", 250000,  2.0);
        Hotel07 H5 = new Hotel07("Anggrek", "Solo", 375000, 3.0);

        list.tambah(H1);
        list.tambah(H2);
        list.tambah(H3);
        list.tambah(H4);
        list.tambah(H5);

        System.out.println("DATA SEBELUM SORTING : ");
        list.tampilAll();
        System.out.println();

        System.out.println("BUBBLE SORT PRICE ASC");
        list.bubbleSortPrice();
        list.tampilAll();
        System.out.println();

        System.out.println("SELECTION SORT PRICE ASC");
        list.selectionSortPrice();
        list.tampilAll();
        System.out.println();

        System.out.println("BUBBLE SORT RATING ASC");
        list.bubbleSortRating();
        list.tampilAll();
        System.out.println();

        System.out.println("SELECTION SORT RATING ASC");
        list.selectionSortRating();
        list.tampilAll();
        System.out.println();
    }
}
