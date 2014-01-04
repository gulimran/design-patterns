package imran.decorator;

public class Mug implements DrinkComponent {

    private float cost = 0f;
    private String description = "mug";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getTotalCost() {
        return cost;
    }
}
