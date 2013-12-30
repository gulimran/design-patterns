package imran.factory;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ShapeFactoryTest {

    @Test
    public void shouldGetAnInstanceOfCircle_WhenCircleTypeShapeCreated() {
        // given
        Shapes type = Shapes.Circle;

        // when
        Shape shape = ShapeFactory.getShape(type);

        // then
        assertTrue(shape instanceof Circle);
    }

    @Test
    public void shouldGetAnInstanceOfSquare_WhenSquareTypeShapeCreated() {
        // given
        Shapes type = Shapes.Square;

        // when
        Shape shape = ShapeFactory.getShape(type);
        shape.draw();
        shape.erase();

        // then
        assertTrue(shape instanceof Square);
    }

    @Test(expected = BadShapeCreationException.class)
    public void shouldThrowException_WhenTriangleTypeShapeCreated() {
        // given
        Shapes type = Shapes.Triangle;

        // when
        Shape shape = ShapeFactory.getShape(type);

        // then
        // should throw BadShapeCreationException
    }
}
