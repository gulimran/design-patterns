package imran.decorator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CoffeeShopTest {

    private CoffeeShop coffeeShop;

    @Test
    public void shouldReturnCappucino() {
        // given
        coffeeShop = new CoffeeShop();
        String expected = "mug foamed milk espresso: £1.0";

        // when
        String actual = coffeeShop.getCappuccino();

        // then
        assertThat(actual, is(expected));
    }
}
