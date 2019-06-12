package section3.staticMembers.ex3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    private static final double IOF = 0.06;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {

            CurrencyConverter cc = new CurrencyConverter(IOF);

            System.out.print("What is the dollar price? ");
            double dollarPrice = sc.nextDouble();

            System.out.print("How many dollars will be bought? ");
            double buyDollar = sc.nextDouble();

            System.out.printf("Amount to be paid in reais = " + String.format("%.2f", cc.calculateDollar(dollarPrice, buyDollar)));
        }

    }
}
