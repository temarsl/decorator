package Decorator;

public class Roses extends Flowers {

    public Roses() {
        description = "Розы";
    }

    @Override
    public double cost() {
        return 300;
    }
}
