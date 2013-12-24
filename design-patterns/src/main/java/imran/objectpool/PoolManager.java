package imran.objectpool;

import java.util.ArrayList;
import java.util.List;

import static imran.objectpool.PoolItem.getInstanceFor;

public class PoolManager {

    private final int maxPoolSize;
    private final List<PoolItem> objectPool;

    public PoolManager(int maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
        this.objectPool = new ArrayList<PoolItem>(maxPoolSize);
    }

    public void add(Object item) {
        if (objectPool.size() < maxPoolSize) {
            objectPool.add(getInstanceFor(item));
        }
        else {
            throw new PoolAlreadyFilledException();
        }
    }

    public Object get() throws EmptyPoolException {
        for (PoolItem poolItem : objectPool) {
            if (!poolItem.isAcquired()) {
                poolItem.setAcquired(true);
                return poolItem.getItem();
            }
        }

        throw new EmptyPoolException();
    }

    public void release(Object item) {
        for (PoolItem poolItem : objectPool) {
            if (item == poolItem.getItem()) {
                poolItem.setAcquired(false);
                return;
            }
        }

        throw new PoolItemNotFoundException();
    }

    public int getMaxPoolSize() {
        return this.maxPoolSize;
    }
}
