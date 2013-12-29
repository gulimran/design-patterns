package imran.strategy;

public class RecursiveNewtonMethodSquareRoot implements SquareRoot {

    int n = 2;

    @Override
    public double sqrt(double input) {
        return findRoot(input,1);
    }

    private double findRoot(double w, double g) {
        double newGuess = g - f(w,g) / fPrime(g);
        if (closeEnough(newGuess, g))
            return newGuess;
        else
            return findRoot(w, newGuess);
    }

    private boolean closeEnough(double a, double b) {
        return (Math.abs(a-b) < Math.abs(b * 0.0001));
    }

    private double fPrime(double g) {
        return (n * Math.pow(g, n-1));
    }

    private double f(double w, double g) {
        return (Math.pow(g,n) - w);
    }
}
