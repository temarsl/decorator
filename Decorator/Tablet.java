package Decorator;

// табличка
public class Tablet extends Decorating {

    public Tablet(Flowers flowers) {
        this.flowers = flowers;
    }

    @Override
    public String getDescription() {
        return flowers.getDescription() + " , табличка";
    }

    @Override
    public double cost() {
        return flowers.cost() + 70;
    }
}
