package imran.observer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FlowerTest {

    private Flower flower;
    private Bee bee;
    private Hummingbird hummingbird;

    @Before
    public void setup() {
        flower = new Flower();
        bee = new Bee("Worker");
        hummingbird = new Hummingbird("Tweety");
    }

    @Test
    public void shouldNotBeAbleToObserveFlowerOpening_WhenNoObserversAttached() {
        // given, when
        flower.open();

        // then
        assertTrue(bee.getState().equals(ObserverState.BEDTIME));
        assertTrue(hummingbird.getState().equals(ObserverState.BEDTIME));
    }

    @Test
    public void shouldBeAbleToObserveFlowerOpening_WhenBeeObserverIsAttached() {
        // given
        flower.attach(bee);

        // when
        flower.open();

        // then
        assertTrue(bee.getState().equals(ObserverState.BREAKFAST));
    }

    @Test
    public void shouldBeAbleToObserveFlowerClosing_WhenHummingBirdObserverIsAttached() {
        // given
        flower.attach(hummingbird);

        // when
        flower.close();

        // then
        assertTrue(hummingbird.getState().equals(ObserverState.BEDTIME));
    }

    @Test
    public void shouldBeAbleToObserveFlowerOpening_WhenMultipleObserversAttached() {
        // given
        flower.attach(bee);
        flower.attach(hummingbird);

        // when
        flower.open();

        // then
        assertTrue(bee.getState().equals(ObserverState.BREAKFAST));
        assertTrue(hummingbird.getState().equals(ObserverState.BREAKFAST));
    }

    @Test
    public void shouldNotBeAbleToObserveFlowerClosing_WhenBeeObserversDetached() {
        // given
        flower.attach(bee);
        flower.attach(hummingbird);
        flower.open();
        flower.detach(bee);

        // when
        flower.close();

        // then
        assertTrue(bee.getState().equals(ObserverState.BREAKFAST));
        assertTrue(hummingbird.getState().equals(ObserverState.BEDTIME));
    }
}
