package seminar_1;

public class Product {
//    все поля (переменные внутри класса) писать вверху класса
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }

    /**
     * ручной override (переопределение)
     * @return
     */
    @Override
    public String toString() {
        return name + " " + cost + " рублей";
    }

//    /**
//     * базовый override (переопределение)
//     * @return String
//     */
//        @Override
//    public String toString() {
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", cost=" + cost +
//                '}';
//    }
}
