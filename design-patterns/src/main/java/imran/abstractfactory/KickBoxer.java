package imran.abstractfactory;

public class KickBoxer implements Player {
    @Override
    public void interactWith(Obstacle o) {
        System.out.print("KickBoxer now fights a ");
        o.action();
    }
}
