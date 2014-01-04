package imran.bridge;

public class BridgeClient {

    private Bridge bridge;

    public BridgeClient(Bridge bridge) {
        this.bridge = bridge;
    }

    public String serviceA() {
        return bridge.service1();
    }
}
