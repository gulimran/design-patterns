package imran.decorator;

public class CoffeeShop {

    public String getCappuccino() {
        DrinkComponent cappuccino = new Espresso(new FoamedMilk(new Mug()));
        return cappuccino.getDescription().trim() + ": £" + cappuccino.getTotalCost();
    }
}
