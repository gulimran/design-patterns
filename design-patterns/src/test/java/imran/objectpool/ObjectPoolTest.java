package imran.objectpool;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class ObjectPoolTest {

    private static final int POOL_SIZE = 10;

    private ObjectPool objectPool;

    @Before
    public void setup() {
        objectPool = new ObjectPool(POOL_SIZE);
    }

    @Test
    public void shouldCreatePoolWithGivenSize() {
        // when, then
        assertThat(objectPool.getMaxPoolSize(), is(POOL_SIZE));
    }

    @Test(expected = PoolAlreadyFilledException.class)
    public void shouldNotBeAbleToAddItem_WhenPoolIsFull() {
        // given
        fillObjectPool();

        // when
        objectPool.add(new Object());
    }

    @Test
    public void shouldBeAbleToGetAPoolItemObject_WhenGetRequestedFromPool() {
        // given
        fillObjectPool();

        // when
        Object actual = objectPool.get();

        // then
        assertTrue(actual instanceof Object);
    }

    @Test
    public void shouldBeAbleToGetSameObject_WhenGetRequestedFromPool() {
        // given
        Object item = new Object();
        objectPool.add(item);

        // when
        Object actual = objectPool.get();

        // then
        assertThat(actual, is(item));
    }

    @Test(expected = EmptyPoolException.class)
    public void shouldThrowExceptionOnGet_WhenPoolIsEmpty() {
        // when
        objectPool.get();
    }

    @Test(expected = EmptyPoolException.class)
    public void shouldThrowExceptionOnGet_WhenAllPoolItemsAcquired() {
        // given
        fillObjectPool();
        acquireAllObjectFromObjectPool();

        // when
        objectPool.get();
    }

    @Test
    public void shouldBeAbleToRelease_WhenAPoolItemIsNotFound() {
        // given
        Object item = new Object();
        objectPool.add(item);
        objectPool.get();

        // when
        objectPool.release(item);
    }

    @Test(expected = PoolItemNotFoundException.class)
    public void shouldNotBeAbleToRelease_WhenAPoolItemIsNotFound() {
        // given
        Object item = new Object();

        // when
        objectPool.release(item);
    }

    private void fillObjectPool() {
        for (int i=0; i<POOL_SIZE; i++) {
            objectPool.add(new Object());
        }
    }

    private void acquireAllObjectFromObjectPool() {
        for (int i=0; i<POOL_SIZE; i++) {
            objectPool.get();
        }
    }
}
