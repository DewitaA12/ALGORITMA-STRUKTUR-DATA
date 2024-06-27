package Week16;


import java.util.*;

public class LoopCollection07 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Salak");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");
        fruits.addLast("Strawberry");

        System.out.println("Sebelum di sorting");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        } 
        
        // Copy elements to ArrayList
        ArrayList<String> tempList = new ArrayList<>(fruits);

        // Sort ArrayList
        Collections.sort(tempList);

        // Clear original stack
        fruits.clear();

        // Add sorted elements back to Stack
        for (String fruit : tempList) {
            fruits.push(fruit);
        }

        // Print sorted stack
        System.out.println(" ");
        System.out.println("Setelah di sorting");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString());

        // Remaining code (printing, etc.) remains the same
        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        fruits.push("Melon");
        fruits.push("Durian");

        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
