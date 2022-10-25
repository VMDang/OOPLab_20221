import java.util.Scanner;

/**
 * Excercise 2.5 Calculate sum, difference, product, and quotient of 2 double numbers which are entered by users
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entered x: ");
        double x = input.nextDouble();

        System.out.println("Entered y: ");
        double y = input.nextDouble();

        System.out.println("Sum:         x + y = " + (x+y) );
        System.out.println("Different:   x - y = " + (x-y) );
        System.out.println("Product:     x * y = " + (x*y) );
        System.out.println("Quotient:    x / y = " + (x/y) );
        System.out.println("Surplus:     x % y = " + (x%y) );
    }
}
