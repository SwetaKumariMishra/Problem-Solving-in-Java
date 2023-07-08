import java.util.Scanner;

class ComplexRootsQuadraticSolver {
    private double a, b, c;

    public ComplexRootsQuadraticSolver(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solve() {
        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficient of x^2 (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the coefficient of x (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter the constant term (c): ");
        double c = scanner.nextDouble();

        ComplexRootsQuadraticSolver quadraticSolver = new ComplexRootsQuadraticSolver(a, b, c);
        quadraticSolver.solve();

        scanner.close();
    }
}
