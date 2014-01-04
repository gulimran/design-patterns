package imran.decorator;

public abstract class Decorator implements DrinkComponent {

    protected DrinkComponent component;

    Decorator(DrinkComponent component) {
        this.component = component;
    }
}
