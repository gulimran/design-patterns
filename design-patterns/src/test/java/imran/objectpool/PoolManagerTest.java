package imran.objectpool;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.spy;

public class PoolManagerTest {

    private static final int POOL_SIZE = 10;

    private PoolManager poolManager;

    @Before
    public void setup() {
        poolManager = new PoolManager(POOL_SIZE);
    }

    @Test
    public void shouldCreatePoolWithGivenSize() {
        // when, then
        assertThat(poolManager.getMaxPoolSize(), is(POOL_SIZE));
    }

    @Test(expected = PoolAlreadyFilledException.class)
    public void shouldNotBeAbleToAddItem_WhenPoolIsFull() {
        // given
        fillObjectPool();

        // when
        poolManager.add(new Object());
    }

    @Test
    public void shouldBeAbleToGetAPoolItemObject_WhenGetRequestedFromPool() {
        // given
        fillObjectPool();

        // when
        Object actual = poolManager.get();

        // then
        assertTrue(actual instanceof Object);
    }

    @Test
    public void shouldBeAbleToGetSameObject_WhenGetRequestedFromPool() {
        // given
        Object item = new Object();
        poolManager.add(item);

        // when
        Object actual = poolManager.get();

        // then
        assertThat(actual, is(item));
    }

    @Test(expected = EmptyPoolException.class)
    public void shouldThrowExceptionOnGet_WhenPoolIsEmpty() {
        // when
        poolManager.get();
    }

    @Test(expected = EmptyPoolException.class)
    public void shouldThrowExceptionOnGet_WhenAllPoolItemsAcquired() {
        // given
        fillObjectPool();
        acquireAllObjectFromObjectPool();

        // when
        poolManager.get();
    }

    @Test
    public void shouldBeAbleToRelease_WhenAPoolItemIsNotFound() {
        // given
        Object item = new Object();
        poolManager.add(item);
        poolManager.get();

        // when
        poolManager.release(item);
    }

    @Test(expected = PoolItemNotFoundException.class)
    public void shouldNotBeAbleToRelease_WhenAPoolItemIsNotFound() {
        // given
        Object item = new Object();

        // when
        poolManager.release(item);
    }

    private void fillObjectPool() {
        for (int i=0; i<POOL_SIZE; i++) {
            poolManager.add(new Object());
        }
    }

    private void acquireAllObjectFromObjectPool() {
        for (int i=0; i<POOL_SIZE; i++) {
            poolManager.get();
        }
    }
}
