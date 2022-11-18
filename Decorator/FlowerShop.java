package Decorator;

public class FlowerShop {
    public static void main(String[] args) {
        Flowers roses = new Roses();
        Flowers lilies = new Lilies();
        Flowers pions = new Pions();

        System.out.println(roses.getDescription());
        System.out.println("Изначальная цена роз = " + roses.cost());
        roses = new Tablet(roses);
        roses = new Tape(roses);
        System.out.println("Цена с украшениями = " + roses.cost());
        System.out.println("Букет: " + roses.getDescription());

        System.out.println();
        System.out.println(lilies.getDescription());
        System.out.println("Изначальная цена лилий = " + lilies.cost());
        lilies = new Basket(lilies);
        lilies = new Leaves(lilies);
        System.out.println("Цена с украшениями = " + lilies.cost());
        System.out.println("Букет: " + lilies.getDescription());

        System.out.println();
        System.out.println(pions.getDescription());
        System.out.println("Изначальная цена пион = " + pions.cost());
        pions = new Basket(pions);
        pions = new Tablet(pions);
        System.out.println("Цена с украшениями = " + pions.cost());
        System.out.println("Букет: " + pions.getDescription());
    }
}
