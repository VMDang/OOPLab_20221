import java.util.Scanner;

public class Equation {
    /**
     * Solve the linear equation with one variable ax + b = 0
     */
    public void linearEquation(){
        Scanner input = new Scanner(System.in);

        System.out.println("Equation ax + b");
        System.out.println("Entered value a :" );
        double a = input.nextDouble();
        System.out.println("Entered value b :" );
        double b = input.nextDouble();

        if (a == 0){
            System.out.println("Value invalid");
            return ;
        }
        System.out.println("--> x = " + b/a);
    }

    /**
     *  Solve first-degree equations (linear system) with two variables
     */
    public void linearSystem(){
        Scanner input = new Scanner(System.in);

        System.out.println("Equation linear systems");
        System.out.println("a11*x + a12 = b1 \n a21*x + a22 = b2");

        System.out.println("Entered value a11 :" );
        double a11 = input.nextDouble();
        System.out.println("Entered value a12 :" );
        double a12 = input.nextDouble();
        System.out.println("Entered value b1 :" );
        double b1 = input.nextDouble();

        System.out.println("Entered value a21 :" );
        double a21 = input.nextDouble();
        System.out.println("Entered value a22 :" );
        double a22 = input.nextDouble();
        System.out.println("Entered value b2 :" );
        double b2 = input.nextDouble();

        double D = a11*a22 - a21*a12;
        double Dx = b1*a22 - b2*a12;
        double Dy = b2*a11 - b1*a21;

        if (D==0){
            if (Dx + Dy == 0){
                System.out.println("system of equations with infinitely many solutions");
            }else System.out.println("system of equations with no solution");
        }else {
            double x = Dx/D;
            double y = Dy/D;
            System.out.printf("system of equations with solutions (z,y) = (%f,%f)", x, y );
        }
    }

    public void secondDegreeEquations(){
        Scanner input = new Scanner(System.in);
        System.out.println("Second-degree equation ax^2 + bx + c = 0");

        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        double d= b * b - 4.0 * a * c;
        if (d> 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else
        {
            System.out.println("Roots are not real.");
        }
    }

    public static void main(String[] args) {
        Equation test = new Equation();
        test.linearEquation();
        test.linearSystem();
        test.secondDegreeEquations();
    }
}
