public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        if (getSize() == Size.TALL) {
            return 1.4;
        } else if (getSize() == Size.GRANDE) {
            return 1.6;
        } else {
            return 1.9;
        }
    }
}
