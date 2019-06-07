package section3.exercicio.ex3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter the name");
        student.name = sc.next();

        System.out.println("Enter the note 1, note 2 and note 3");
        student.n1 = sc.nextDouble();
        student.n2 = sc.nextDouble();
        student.n3 = sc.nextDouble();

        System.out.println(student);

        if (student.calculateFinalGrade() >= 60) {
            System.out.println("\nFinal Grade = " + student.calculateFinalGrade() + "\nPASS");
        } else {
            System.out.println("\nFinal Grade = " + student.calculateFinalGrade() + " \nFAILED");
            System.out.println("MISSING " + student.missingPoint() + " POINT" );
        }

        sc.close();
    }
}
