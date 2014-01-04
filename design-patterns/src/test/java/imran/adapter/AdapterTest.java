package imran.adapter;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AdapterTest {

    @Test
    public void shouldCallLegacyMethod_WhenNewFeatureIsRequested() {
        // given
        NewFeature newFeature = new Adapter(new LegacyFeature());
        String expected = "LegacyFeature: SpecificRequest";

        // when
        String actual = newFeature.request();

        // then
        assertThat(actual, is(expected));
    }
}
