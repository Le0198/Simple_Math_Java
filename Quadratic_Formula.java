import java.util.Scanner;

public class Quadratic_Formula {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //Initializes a new scanner object
        System.out.println("Welcome! This program receives three inputs as doubles and gives the result of plugging\n" +
                            "those values into the quadratic formula. Only real number results will be given.");

        System.out.println("\nPlease enter a nonzero value for A.");
        double a = scan.nextDouble();
        System.out.println("Please enter a value for B.");
        double b = scan.nextDouble();
        System.out.println("Please enter a value for C.");
        double c = scan.nextDouble();

        double result_one = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2*a);
        double result_two = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2*a);

        System.out.println("The first result of the quadratic formula for the values A, B, and C is " + result_one);
        System.out.println("The second result of the quadratic formula for the values A, B, and C is " + result_two);
    }
}
