package section3.staticMembers.ex3;

public class CurrencyConverter {

    public final double IOF = 6.0 / 100.0;

    public static double dollarPrice, buyDollar, calc;

    public double calculateDollar() {

        calc = dollarPrice * buyDollar;

        return calc += calc * IOF;

    }

}
