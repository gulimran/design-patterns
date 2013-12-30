package imran.abstractfactory;

public class CatsInMaze implements GameFactory {
    @Override
    public Player getPlayer() {
        return new Cat();
    }

    @Override
    public Obstacle getObstacle() {
        return new Maze();
    }
}
