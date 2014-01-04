package imran.composite;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CompositeTest {

    private Composite composite;

    @Test
    public void shouldReturnLeafName_WhenComponentHasOneElement() {
        // given
        String leafName = "Leaf-1";
        composite = new Composite(leafName);

        // when
        String result = composite.getName();

        // then
        assertThat(result, is(leafName));
    }

    @Test
    public void shouldReturnSingleNodeAndLeafName_WhenComponentHasTwoElements() {
        // given
        String leafName = "Leaf-1";
        String nodeName = "Node-1";
        composite = new Composite(nodeName);
        composite.addComponent(new Leaf(leafName));

        // when
        String result = composite.getName();

        // then
        assertThat(result, is(nodeName+leafName));
    }

    @Test
    public void shouldReturnMultipleNodeAndLeafName_WhenComponentHasMultipleElements() {
        // given
        String leafName1 = "Leaf-1";
        String leafName2 = "Leaf-2";
        String nodeName1 = "Node-1";
        String nodeName2 = "Node-2";

        Composite composite1 = new Composite(nodeName1);
        composite1.addComponent(new Leaf(leafName1));

        Composite composite2 = new Composite(nodeName2);
        composite2.addComponent(composite1);
        composite2.addComponent(new Leaf(leafName2));


        // when
        String result = composite2.getName();

        // then
        assertThat(result, is(nodeName2+nodeName1+leafName1+leafName2));
    }
}
