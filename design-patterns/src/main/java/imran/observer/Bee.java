package imran.observer;

import static imran.observer.ObserverState.*;

public class Bee extends AbstractObserver {

    private String name;

    public Bee(String name) {
        this.name = name;
        this.state = BEDTIME;
    }

    @Override
    public void update(Subject subject) {
        FlowerState flowerState = (FlowerState) subject.getState();

        switch (flowerState) {
            case OPEN:
                System.out.println("Bee " + name + "'s breakfast time!");
                state = BREAKFAST;
                break;
            case CLOSE:
                System.out.println("Bee " + name + "'s bed time!");
                state = BEDTIME;
                break;
        }
    }
}
