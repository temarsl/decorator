// приходится создавать отдельные классы с начинкой и их появляется слишком много
// и каждый раз пересчитывать цену
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
