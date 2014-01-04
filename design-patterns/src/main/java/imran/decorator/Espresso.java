package imran.decorator;

public class Espresso extends Decorator {

    private float cost = 0.75f;
    private String description = " espresso";

    public Espresso(DrinkComponent component) {
        super(component);
    }

    @Override
    public float getTotalCost() {
        return component.getTotalCost() + cost;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + description;
    }
}
