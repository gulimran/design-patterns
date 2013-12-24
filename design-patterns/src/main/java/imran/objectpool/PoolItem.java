package imran.objectpool;

public class PoolItem {

    private boolean acquired = false;
    private Object item;

    private PoolItem(Object item) {
        this.item = item;
    }

    public boolean isAcquired() {
        return acquired;
    }

    public void setAcquired(boolean acquired) {
        this.acquired = acquired;
    }

    public Object getItem() { return item; }

    public static PoolItem getInstanceFor(Object item) {
        return new PoolItem(item);
    }
}
