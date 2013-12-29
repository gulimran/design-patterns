package imran.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ProxyTest {

    @InjectMocks
    private Proxy proxy;

    @Mock
    private Proxy mockProxy;

    @Test
    public void shouldCallOriginalMethod_WhenProxyMethodIsInvoked() {
        // when
        proxy.printA();

        // then
        verify(mockProxy).printA();
    }
}
