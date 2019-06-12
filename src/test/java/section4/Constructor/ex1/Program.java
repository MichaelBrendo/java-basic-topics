package section4.Constructor.ex1;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        int accNumber;
        String holderName;
        double ccValue;
        String initialDeposit;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("===Welcome to the open bank===");

            System.out.printf("Enter account number: ");
            accNumber = sc.nextInt();

            System.out.printf("Enter account holder: ");
            holderName = sc.next();

            System.out.printf("Is there a initial deposit (y/n)?: ");
            initialDeposit = sc.next();

            BankingOperations bo = new BankingOperations(accNumber, holderName);

            if (initialDeposit.equals("y")) {
                System.out.printf("Enter initial deposit value: : ");
                ccValue = sc.nextDouble();

                bo.setCcValue(ccValue);

                System.out.printf("Account data: ");
                System.out.printf("Account " + bo.getAccNumber() + " , holder: " + bo.getHolderName() + ", Balance: $ " + bo.getCcValue());

            } else {

                System.out.printf("Account data: ");
                System.out.printf("Account " + bo.getAccNumber() + " , holder: " + bo.getHolderName());

            }





        }

    }
}
