package section3.staticMembers.ex3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CurrencyConverter cc = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        CurrencyConverter.dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.buyDollar = sc.nextDouble();


        System.out.printf("Amount to be paid in reais = " + String.format("%.2f", cc.calculateDollar()) );

        sc.close();

    }
}
