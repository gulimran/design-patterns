package imran.observer;

abstract class AbstractObserver implements Observer {

    protected ObserverState state;

    public ObserverState getState() {
        return state;
    }
}
