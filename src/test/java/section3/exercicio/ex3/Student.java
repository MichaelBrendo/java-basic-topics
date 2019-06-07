package section3.exercicio.ex3;

public class Student {

    String name;
    double n1, n2, n3, point;

    public double calculateFinalGrade() {
        return (n1 + n2 + n3);
    }

    public double missingPoint() {
        if (calculateFinalGrade() < 60) {
            return 60 - calculateFinalGrade();
        } else {
            return 0;
        }

    }

    public String toString() {

        return "Name: " + name
                + "\nNote 1: " + n1
                + "\nNote 2: " + n2
                + "\nNote 3: " + n3;
    }

}
