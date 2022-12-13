package seminar_1;

import java.util.ArrayList;
import java.util.List;
//public class VendingMachine extends Object {

public class VendingMachine {
    private List<Product> products;

    //    Alt + ins
    public VendingMachine(List<Product> products) {
//        super(); стоит везде по умолчанию. наследование от класса Object
        this.products = products;
    }

    /**
     * пустой конструктор
     */
    public VendingMachine() {
//        вызов основного конструктора
        this(new ArrayList<>());
    }

    public List<Product> getProductByCost(double cost) {
        List<Product> res = new ArrayList<>();
        for (Product product : products) {
            if (product.getCost() <= cost) {
                res.add(product);
            }
        }
        return res;
    }

//    public void add(String name, double cost) {
//        Product product = new Product(name, cost);
//        products.add(product);
//    }
    public void add(Product product) {
//        Product product = new Product(name, cost);
        products.add(product);
    }


    @Override
    public String toString() {
        return "VendingMachine{" +
                "products=" + products +
                '}';
    }
}
