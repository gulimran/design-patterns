package imran.facade;

public class CartesianPoint {

    private double xCoordinate;
    private double yCoordinate;

    public CartesianPoint(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double getXCoordinate() {
        return xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public void  move(int dx, int dy) {
        xCoordinate += dx;
        yCoordinate += dy;
    }

    @Override
    public String toString() {
        return "(" + xCoordinate + "," + yCoordinate + ")";
    }
}
