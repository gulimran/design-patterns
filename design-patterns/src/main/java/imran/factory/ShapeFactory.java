package imran.factory;

public class ShapeFactory {

    public static Shape getShape(Shapes type) {

        switch (type) {
            case Circle:
                return new Circle();
            case Square:
                return new Square();
        }

        throw new BadShapeCreationException("Bad shape creation: " + type);
    }
}
