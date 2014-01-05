package imran.facade;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class PointTest {

    private PointFacade facade;

    @Test
    public void shouldReturnNewCoordinates_WhenPointIsMoved() {
        // given
        facade = new Point(2, 4);

        // when
        facade.move(-2, -4);

        // then
        assertThat(facade.getXCoordinate(), is(0.0));
        assertThat(facade.getYCoordinate(), is(0.0));
    }

    @Test
    public void shouldReturnNewCoordinates_WhenPointIsRotated() {
        // given
        facade = new Point(0, 0);
        Point end = new Point(3, 3);

        // when
        facade.rotate(45, end);

        // then
        assertEquals(facade.getXCoordinate(), 3.00, 0.005);
        assertEquals(facade.getYCoordinate(), -1.24, 0.005);
    }
}
