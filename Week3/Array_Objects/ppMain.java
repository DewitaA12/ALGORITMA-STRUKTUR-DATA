import java.util.Scanner;
public class ppMain {
public static void main(String[] args) {//Main method
    Scanner sc = new Scanner(System.in);
    PersegiPanjang[] ppArray = new PersegiPanjang[3]; //>>Persegipanjang merupakan tipe data object, digunakan untuk deklarasi array object
    

    for (int i = 0; i < 3; i++)
    {
        ppArray[i] = new PersegiPanjang(); 
        //PersegiPanjang merupakan konstruktor default yang namanya sama dengan class digunakan untuk instansiasi/membuat objek
        System.out.println("Persegi panjang ke-" + i);
        System.out.print("Masukkan panjang: ");
        ppArray[i].panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        ppArray[i].lebar = sc.nextInt();
    }

    for (int i = 0; i < 3; i++)
    {
        System.out.println("Persegi Panjang ke-" + i);
        System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        
    sc.close();
    }

    }
}