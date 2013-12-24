package imran.singleton;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

public class SingletonTest {

    private Singleton singleton;

    @Test
    public void shouldGetSingletonInstance() {
        // when
        singleton = Singleton.getInstance();

        // then
        assertNotNull(singleton);
    }

    @Test
    public void shouldGetStateFromSingletonInstance() {
        // given
        int expected = 45;
        singleton = Singleton.getInstance();
        singleton.setValue(expected);

        // when, then
        assertThat(singleton.getValue(), is(expected));
    }
}
