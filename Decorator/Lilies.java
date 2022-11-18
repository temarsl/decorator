package Decorator;

public class Lilies extends Flowers {

    public Lilies() {
        description = "Лилии";
    }

    @Override
    public double cost() {
        return 250;
    }
}
