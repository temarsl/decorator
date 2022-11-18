public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        if (getSize() == Size.TALL) {
            return 1.8;
        } else if (getSize() == Size.GRANDE) {
            return 1.9;
        } else {
            return 2.1;
        }
    }
}
