package imran.bridge;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BridgeClientTest {

    private BridgeClient bridgeClient;

    @Test
    public void shouldUseLibraryMethod_WhenClientServiceARequested() {
        // given
        Implementation implementation = new Implementation1();
        Bridge bridge = new Bridge(implementation);
        bridgeClient = new BridgeClient(bridge);
        String expected = "Library.method1()Library.method2()";

        // when
        String actual = bridgeClient.serviceA();

        // then
        assertThat(actual, is(expected));
    }
}
