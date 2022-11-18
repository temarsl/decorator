public class DarkRoast extends Beverage {
    @Override
    public double cost() {
        return super.cost() + 70;
    }

    public DarkRoast() {
        description = "Dark Roast";
    }
}
