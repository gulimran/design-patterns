package imran.decorator;

public class FoamedMilk extends Decorator {

    private float cost = 0.25f;
    private String description = " foamed milk";

    public FoamedMilk(DrinkComponent component) {
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
