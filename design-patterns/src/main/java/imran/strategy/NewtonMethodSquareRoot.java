package imran.strategy;

public class NewtonMethodSquareRoot implements SquareRoot {
    @Override
    public double sqrt(double input) {
        double squareRoot = input/2;
        double guess = 0;

        do {
            guess=squareRoot;
            squareRoot = (guess + (input/guess))/2;
        }
        while((guess-squareRoot)!=0);

        return squareRoot;
    }
}
