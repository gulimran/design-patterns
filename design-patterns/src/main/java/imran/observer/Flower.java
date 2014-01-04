package imran.observer;

import java.util.ArrayList;
import java.util.List;

import static imran.observer.FlowerState.*;

public class Flower implements Subject  {

    private List<Observer> observers;
    private FlowerState flowerState;

    public Flower() {
        observers = new ArrayList<Observer>();
        flowerState = CLOSE;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public Object getState() {
        return flowerState;
    }

    /**
     * Opens its petals
     */
    public void open() {
        flowerState = OPEN;
        notifyObservers();
    }

    /**
     *  Closes its petals
     */
    public void close() {
        flowerState = CLOSE;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
