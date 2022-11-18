public class Main {
    public static void main(String[] args) {
        HouseBlend houseBlend = new HouseBlend();
        System.out.println(houseBlend.cost());
        houseBlend.setMocha(true);
        houseBlend.setMilk(true);
        System.out.println(houseBlend.cost());
    }
}
