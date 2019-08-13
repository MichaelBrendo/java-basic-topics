package section4.Constructor.ex1;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        int accNumber;
        String holderName;
        double inicialDeposit, ccWithdraw;
        String initialDeposit;
        Account bo;

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("===Welcome to the open bank===");

            System.out.printf("Enter account number: ");
            accNumber = sc.nextInt();

            System.out.printf("Enter account holder: ");
            sc.nextLine();
            holderName = sc.nextLine();

            System.out.printf("Is there a initial deposit (y/n)?: ");
            initialDeposit = sc.next();



            if (initialDeposit.equals("y")) {
                System.out.printf("Enter initial deposit value: : ");
                inicialDeposit = sc.nextDouble();

                bo = new Account(accNumber, holderName, inicialDeposit);

                System.out.printf("Account data: ");
                System.out.println(bo);

            } else {

                bo = new Account(accNumber, holderName);
                System.out.printf("Account data: ");
                System.out.println(bo);

            }

            System.out.printf("");
            System.out.print("\nEnter a deposit value: ");
            inicialDeposit = sc.nextDouble();

            bo.deposit(inicialDeposit);

            System.out.printf("");
            System.out.printf("Update a account data: ");
            System.out.printf(String.valueOf(bo));

            System.out.print("\nEnter a withdraw value: ");
            ccWithdraw = sc.nextDouble();

            bo.withdraw(ccWithdraw);

            System.out.printf("");
            System.out.printf("Update a account data: ");
            System.out.println(bo);

        }

    }
}
