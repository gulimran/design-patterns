package imran.facade;

public class PolarPoint {

    private double radius;
    private double angle;

    public PolarPoint(double radius, double angle) {
        this.radius = radius;
        this.angle = angle;
    }

    public void  rotate( int ang ) {
        angle += ang % 360;
    }

    public double getAngle() {
        return angle;
    }

    @Override
    public String toString() {
        return "[" + radius + "@" + angle + "]";
    }
}
