package imran.abstractfactory;

public class Cat implements Player {
    @Override
    public void interactWith(Obstacle o) {
        System.out.print("Cat has encountered a ");
        o.action();
    }
}
