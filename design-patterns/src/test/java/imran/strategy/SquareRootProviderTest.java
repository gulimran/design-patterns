package imran.strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareRootProviderTest {

    private SquareRootProvider provider;

    @Test
    public void testSquareRoot_WhenJavaMathLibraryIsUsed() {
        // given
        double delta = 0.0001;
        provider = new SquareRootProvider(new JavaMathSquareRoot());

        // when
        double result = provider.sqrt(16.0);

        // then
        assertEquals(4.0, result, delta);
    }

    @Test
    public void testSquareRoot_WhenNewtonMethodIsUsed() {
        // given
        double delta = 0.0001;
        provider = new SquareRootProvider(new NewtonMethodSquareRoot());

        // when
        double result = provider.sqrt(16.0);

        // then
        assertEquals(4.0, result, delta);
    }

    @Test
    public void testSquareRoot_WhenRecursiveNewtonMethodIsUsed() {
        // given
        double delta = 0.0001;
        provider = new SquareRootProvider(new RecursiveNewtonMethodSquareRoot());

        // when
        double result = provider.sqrt(16.0);

        // then
        assertEquals(4.0, result, delta);
    }
}
