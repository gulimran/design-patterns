package imran.adapter;

public class Adapter extends NewFeature {

    private LegacyFeature adaptee;

    public Adapter(LegacyFeature legacyFeature) {
        this.adaptee = legacyFeature;
    }

    @Override
    public String request() {
        return adaptee.specificRequest();
    }
}
