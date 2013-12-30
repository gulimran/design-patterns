package imran.abstractfactory;

public class UltimateFighters implements GameFactory {
    @Override
    public Player getPlayer() {
        return new KickBoxer();
    }

    @Override
    public Obstacle getObstacle() {
        return new Sword();
    }
}
