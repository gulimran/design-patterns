package imran.state;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class StateServiceProviderTest {

    @InjectMocks
    private StateServiceProvider serviceProvider;

    @Mock
    private State state;

    @Test
    public void shouldCallStateOperation_WhenServiceMethodIsCalled() {
        // when
        serviceProvider.service();

        // then
        verify(state).operation1();
    }

    @Test
    public void testStateImplOneMethodCall_WhenServiceStateChanged() {
        // given
        serviceProvider.changeState(new StateImplOne());

        // when
        serviceProvider.service();

        // then
        // should print result on std out
    }

    @Test
    public void testStateImplTwoMethodCall_WhenServiceStateChanged() {
        // given
        serviceProvider.changeState(new StateImplTwo());

        // when
        serviceProvider.service();

        // then
        // should print result on std out
    }
}
