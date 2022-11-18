public class Beverage {
    String description = "Unckown Beverage";
    Boolean milk = false;
    Boolean soy = false;
    Boolean mocha = false;
    Boolean whip = false;

    // нельзя добавить двойное молоко например и неудобно что все дополнения в разных местах. хочется это как-то
    // систематизировать. для новых классов эти дополнения могут быть неуместны.

    // для новых дополнений придется изменять метод кост

    public String getDescription() {
        return description;
    }

    public double cost() {
        double price = 0;
        if (getMilk() == true) {
            price += 15;
        }
        if (getSoy() == true) {
            price +=10;
        }
        if (getMocha() == true) {
            price += 45;
        }
        if (getWhip() == true) {
            price += 30;
        }
        return price;
    }

    public Boolean getMilk() {
        return milk;
    }

    public void setMilk(Boolean milk) {
        this.milk = milk;
    }

    public Boolean getSoy() {
        return soy;
    }

    public void setSoy(Boolean soy) {
        this.soy = soy;
    }

    public Boolean getMocha() {
        return mocha;
    }

    public void setMocha(Boolean mocha) {
        this.mocha = mocha;
    }

    public Boolean getWhip() {
        return whip;
    }

    public void setWhip(Boolean whip) {
        this.whip = whip;
    }
}
