public class Espresso extends Beverage {
    @Override
    public double cost() {
        return super.cost() + 80;
    }

    public Espresso() {
        description = "Espresso";
    }
}
