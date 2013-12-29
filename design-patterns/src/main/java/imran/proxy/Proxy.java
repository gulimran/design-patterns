package imran.proxy;

public class Proxy implements Printer {
    private Printer implementation;

    public Proxy(Printer implementation) {
        this.implementation = implementation;
    }

    @Override
    public void printA() {
        implementation.printA();
    }

    @Override
    public void printB() {
        implementation.printB();
    }

    @Override
    public void printC() {
        implementation.printC();
    }
}
