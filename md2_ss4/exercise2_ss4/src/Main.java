import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double delta = equation.getDiscriminant();

        if (delta > 0) {
            System.out.printf("The equation has two roots: %.2f and %.2f%n", equation.getRoot1(), equation.getRoot2());
        } else if (delta == 0) {
            System.out.printf("The equation has one root: %.2f%n", equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }

        scanner.close();
    }
}
