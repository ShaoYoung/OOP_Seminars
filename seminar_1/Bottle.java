package seminar_1;

public class Bottle extends Product {

    private double volume;

    /**
     * Необходимо создать объект родительского класса
     * @param name
     * @param cost
     */
    public Bottle(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + " " + volume + " л.";
    }



//    @Override
//    public double getCost() {
//        return super.getCost();
//    }
}
