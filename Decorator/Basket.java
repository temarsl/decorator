package Decorator;

// корзинка
public class Basket extends Decorating {

    public Basket(Flowers flowers) {
        this.flowers = flowers;
    }

    @Override
    public String getDescription() {
        return flowers.getDescription() + " , корзинка";
    }

    @Override
    public double cost() {
        return flowers.cost() + 180;
    }
}
