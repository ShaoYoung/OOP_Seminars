package seminar_1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
//        List<Product> products = new ArrayList<>();
//        VendingMachine vendingMachine1 = new VendingMachine(products);
//
//        Product product = new Product("Coca-cola", 110);

//        vendingMachine.add("Coca-cola", 110);
//        vendingMachine.add("Pepsi-cola", 120);
//        vendingMachine.add("Milka", 80);
        vendingMachine.add(new Bottle("Coca-cola", 90, 0.5));
        vendingMachine.add(new Product("Pepsi-cola", 120));
        vendingMachine.add(new Product("Milka", 80));
        List<Product> products = vendingMachine.getProductByCost(110);
        System.out.println(products);

    }
}
