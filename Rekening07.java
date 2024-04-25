public class Rekening07 {
    String noRek;
    String nama;
    String telefon;
    String email;
    double saldo;
    
    

    Rekening07 (String noR, String nama, String noHP, String email, double saldo){
    this.noRek = noR;
    this.nama = nama;
    this.telefon = noHP;
    this.email = email;
    this.saldo = saldo;
    }

    Rekening07 () {

    }

    public void tampilAll(){
        System.out.println();
        System.out.println("No. Rekening \t= " + noRek);
        System.out.println("Nama \t\t= " + nama);
        System.out.println("Telefon \t= " + telefon);
        System.out.println("Email \t\t= " + email);
        System.out.println("Saldo \t\t= " + saldo);
    }
    
}
