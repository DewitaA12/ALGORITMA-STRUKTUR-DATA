import java.util.Scanner;
public class ppMain {
public static void main(String[] args) {//Main method
    Scanner sc = new Scanner(System.in);
    PersegiPanjang[][] ppArray = new PersegiPanjang[3][3]; 
    //>>Persegipanjang merupakan tipe data object, digunakan untuk deklarasi array object
    

    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
        ppArray[i][j] = new PersegiPanjang(); 
        /*PersegiPanjang merupakan konstruktor default yang namanya 
        sama dengan class digunakan untuk instansiasi/membuat objek*/
        System.out.println("Persegi panjang ke-" + i + "," + j);
        System.out.print("Masukkan panjang: ");
        ppArray[i][j].panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        ppArray[i][j].lebar = sc.nextInt();
    }
}

    for (int i = 0; i < 3; i++){
    for (int j = 0; j < 3; j++){
        System.out.println();
        System.out.println("Persegi Panjang ke-" + i + "," + j);
        System.out.println("Panjang: " + ppArray[i][j].panjang + ", lebar: " + ppArray[i][j].lebar);
    }
}
sc.close();

    }
}
