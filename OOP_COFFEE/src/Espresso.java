public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        if (getSize() == Size.TALL) {
            return 2.1;
        } else if (getSize() == Size.GRANDE) {
            return 2.2;
        } else {
            return 2.4;
        }
    }
}
