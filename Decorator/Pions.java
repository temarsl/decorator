package Decorator;

public class Pions extends Flowers {

    public Pions() {
        description = "Пионы";
    }

    @Override
    public double cost() {
        return 400;
    }
}
