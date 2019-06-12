package section3.staticMembers.ex3;

public class CurrencyConverter {

    private static final double IOF = 0.06;

    private final double iof;

    public CurrencyConverter(double iof) {

        if (iof < 0) {
            throw new IllegalArgumentException("IOF cannot be lower than zero!");
        }

        this.iof = iof;
    }

    public double calculateDollar(double dollarPrice, double buyDollar) {

        double calc = dollarPrice * buyDollar;
        return calc + (calc * IOF);
    }
}
