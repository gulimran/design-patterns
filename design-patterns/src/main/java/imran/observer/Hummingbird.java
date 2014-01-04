package imran.observer;

import static imran.observer.ObserverState.*;

public class Hummingbird extends AbstractObserver {

    private String name;

    public Hummingbird(String name) {
        this.name = name;
        this.state = BEDTIME;
    }

    @Override
    public void update(Subject subject) {
        FlowerState flowerState = (FlowerState) subject.getState();

        switch (flowerState) {
            case OPEN:
                System.out.println("Hummingbird " + name + "'s breakfast time!");
                state = BREAKFAST;
                break;
            case CLOSE:
                System.out.println("Hummingbird " + name + "'s bed time!");
                state = BEDTIME;
                break;
        }
    }
}
