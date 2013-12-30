package imran.abstractfactory;

import org.junit.Test;

public class GameTest {

    private Game game;
    private GameFactory factory;

    @Test
    public void shouldPlayCatsInMazeGame() {
        // given
        factory = new CatsInMaze();
        game = new Game(factory);

        // when
        game.play();

        // then
        // should print to std out
    }

    @Test
    public void shouldPlayUltimateFightersGame() {
        // given
        factory = new UltimateFighters();
        game = new Game(factory);

        // when
        game.play();

        // then
        // should print to std out
    }
}
