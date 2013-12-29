package imran.strategy;

public class SquareRootProvider {
    private SquareRoot algorithm;

    public SquareRootProvider(SquareRoot squareRoot) {
        this.algorithm = squareRoot;
    }

    public double sqrt(double input) {
        return algorithm.sqrt(input);
    }

    void changeAlgorithm(SquareRoot newAlgorithm) {
        algorithm = newAlgorithm;
    }
}
