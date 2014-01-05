package imran.facade;

public interface PointFacade {
    void move(int destinationXCoordinate, int destinationYCoordinate);
    void rotate(int angle, PointFacade point);
    double getXCoordinate();
    double getYCoordinate();
}
