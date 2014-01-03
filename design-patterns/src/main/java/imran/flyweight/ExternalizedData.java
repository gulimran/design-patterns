package imran.flyweight;

public class ExternalizedData {

    static final int SIZE = 500000;

    private static int[] id = new int[SIZE];
    private static double[] xCoordinate = new double[SIZE];
    private static double[] yCoordinate = new double[SIZE];

    static {
        for(int i = 0; i < SIZE; i++)
            id[i] = i;
    }

    public static int getId(int index) {
        return id[index];
    }

    public static double getXCoordinate(int index) {
        return xCoordinate[index];
    }

    public static void setXCoordinate(int index, double value) {
        xCoordinate[index] = value;
    }

    public static double getYCoordinate(int index) {
        return yCoordinate[index];
    }

    public static void setYCoordinate(int index, double value) {
        yCoordinate[index] = value;
    }
}
