package imran.observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    Object getState();
}
