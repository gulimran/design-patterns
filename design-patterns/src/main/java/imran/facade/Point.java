package imran.facade;

public class Point implements PointFacade {

    private CartesianPoint cartesianPoint;

    public Point(double xCoordinate, double yCoordinate) {
        this.cartesianPoint = new CartesianPoint(xCoordinate, yCoordinate);
    }

    @Override
    public double getXCoordinate() {
        return cartesianPoint.getXCoordinate();
    }

    @Override
    public double getYCoordinate() {
        return cartesianPoint.getYCoordinate();
    }

    @Override
    public void move(int destinationXCoordinate, int destinationYCoordinate) {
        cartesianPoint.move(destinationXCoordinate, destinationYCoordinate);
    }

    @Override
    public void rotate(int angle, PointFacade point) {
        double x = cartesianPoint.getXCoordinate() - point.getXCoordinate();
        double y = cartesianPoint.getYCoordinate() - point.getYCoordinate();

        double radius = Math.sqrt(x*x+y*y);
        double originalAngle = Math.atan2(y,x)*180/Math.PI;

        PolarPoint polarPoint = new PolarPoint(radius, originalAngle);
        polarPoint.rotate(angle);

        double newAngle = polarPoint.getAngle();
        double destXCoordinate = radius*Math.cos(newAngle*Math.PI/180) + point.getYCoordinate();
        double destYCoordinate = radius*Math.sin(newAngle*Math.PI/180) + point.getYCoordinate();

        cartesianPoint = new CartesianPoint(destXCoordinate, destYCoordinate);
    }

    @Override
    public String toString() {
        return cartesianPoint.toString();
    }
}
