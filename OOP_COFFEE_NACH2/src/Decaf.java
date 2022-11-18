public class Decaf extends Beverage {
    @Override
    public double cost() {
        return super.cost() + 85;
    }

    public Decaf() {
        description = "Decaf";
    }
}
