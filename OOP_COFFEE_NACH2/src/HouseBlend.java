public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return 60 + super.cost();
    }

    public HouseBlend() {
        description = "House Blend";
    }
}
