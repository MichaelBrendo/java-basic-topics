package section5.Vector.ex;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    private static int ROOM = 10;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[ROOM];

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String email = sc.nextLine();
            int room = sc.nextInt();
            vect[room] = new Rent(name, email);
        }

        for (int j = 0; j < ROOM; j++)
            if (vect[j] != null) {
                System.out.println(j + ":" + vect[j]);
            }


        sc.close();

    }
}
