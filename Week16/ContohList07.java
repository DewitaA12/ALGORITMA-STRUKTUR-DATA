package Week16;

import java.util.ArrayList;
import java.util.List;

public class ContohList07 {
    public static void main(String[] args) {
        // Membuat daftar baru
        List<Integer> l = new ArrayList<>();

        // Menambahkan elemen ke daftar
        l.add(1);
        l.add(2);
        l.add(3);
        //l.add("Cireng");

        // Menampilkan informasi tentang daftar
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n",
            l.get(0), l.size(), l.get(l.size() - 1));

        // Menambahkan elemen baru ke daftar
        l.add(4);

        // Menghapus elemen dari daftar
        l.remove(0);

        // Menampilkan informasi tentang daftar setelah diubah
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n",
            l.get(0), l.size(), l.get(l.size() - 1));

         // Buat list baru
         ArrayList<String> names = new ArrayList<>();

         // Nambah elemen ke lisst
         names.add("Noureen");
         names.add("Akhleema");
         names.add("Shannum");
         names.add("Uwais");
         names.add("Al-Qarni");
        
 
         // Menampilkan informasi tentang list
         System.out.printf("Elemen 0: %s, Total elemen: %d, Elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));
 
         // Mengatur elemen di list
         //names.set(0, "My kid");

         //no 4
         names.addFirst("Mei-mei");
         System.out.printf("Elemen 0: %s, Total elemen: %d, Elemen terakhir: %s\n",
         names.getFirst(), names.size(), names.getLast());
         System.out.println("Names: " + names.toString());
 
 
         // Menampilkan informasi list setlah perubahan
        //  System.out.printf("Elemen 0: %s, Total elemen: %d, Elemen terakhir: %s\n",
        //         names.get(0), names.size(), names.get(names.size() - 1));
 
        //  // Print list menggunakan toString() method
        //  System.out.println("Names: " + names.toString());
     }
    }

