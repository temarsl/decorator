package Decorator;

// листья
public class Leaves extends Decorating {

    public Leaves(Flowers flowers) {
        this.flowers = flowers;
    }

    @Override
    public String getDescription() {
        return flowers.getDescription() + " , листья";
    }

    @Override
    public double cost() {
        return flowers.cost() + 80;
    }
}
