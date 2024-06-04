package Week11.TugasSLL;

public class Main {
    public static void main(String[] args) {
        SLL singLL = new SLL();

        //Add data
        singLL.print();
        singLL.addFirst(new Mahasiswa("112", "Prita"));
        singLL.print();
        singLL.addLast(new Mahasiswa("115", "Sari"));
        singLL.print();
        singLL.addFirst(new Mahasiswa("111", "Anton"));
        singLL.print();
        singLL.insertAfter("112", new Mahasiswa("113", "Yusuf"));
        singLL.print();
        singLL.insertAt(3, new Mahasiswa("114", "Doni"));
        singLL.print();

    }
}
