package imran.bridge;

public class Bridge {

    protected Implementation implementation;

    public Bridge(Implementation imp) {
        implementation = imp;
    }

    public String service1() {
        return implementation.facility1() + implementation.facility2();
    }
}
