package Week13.Tugas;

public class Main {
   
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
    
            tree.add(5);
            tree.add(3);
            tree.add(7);
            tree.add(2);
            tree.add(4);
            tree.add(6);
            tree.add(8);
    
            System.out.println("Nilai paling kecil    \t: " + tree.findMinValue());
            System.out.println("Nilai paling besar    \t: " + tree.findMaxValue());
    
            System.out.print("Data leaf node        \t: ");
            tree.displayLeafNodes();
            System.out.println();
    
            System.out.println("Jumlah leaf dalam tree \t: " + tree.countLeafNodes());}}

    