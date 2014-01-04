package imran.bridge;

public class Implementation1 implements Implementation {

    private Library delegate = new Library();

    @Override
    public String facility1() {
        return delegate.method1();
    }

    @Override
    public String facility2() {
        return delegate.method2();
    }
}
