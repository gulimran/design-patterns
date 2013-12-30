package imran.abstractfactory;

public class Game {

    private GameFactory factory;
    private Player player;
    private Obstacle obstacle;

    public Game(GameFactory factory) {
        this.factory = factory;
        this.player = factory.getPlayer();
        this.obstacle = factory.getObstacle();
    }

    public void play() {
        player.interactWith(obstacle);
    }
}
