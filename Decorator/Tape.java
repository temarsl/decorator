package Decorator;

// лента
public class Tape extends Decorating {

    public Tape(Flowers flowers) {
        this.flowers = flowers;
    }

    @Override
    public String getDescription() {
        return flowers.getDescription() + " , лента";
    }

    @Override
    public double cost() {
        return flowers.cost() + 30;
    }
}
