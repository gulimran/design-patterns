package imran.flyweight;

import static imran.flyweight.ExternalizedData.*;

public class DataPoint {

    public double getX(int index) {
        return getXCoordinate(index);
    }

    public void setX(int index, double value) {
        setXCoordinate(index, value);
    }

    public double getY(int index) {
        return getYCoordinate(index);
    }

    public void setY(int index, double value) {
        setYCoordinate(index, value);
    }

    public String toString(int index) {
        return "id: " + getId(index) +
                ", x = " + getX(index) +
                ", y = " + getY(index);

    }
}
