import java.util.Scanner;

public class Circle_Area_Perimeter {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //Initializes a new scanner object

        System.out.println("Welcome! This programe gets a radiues as a double and outputs\n" +
        "the are and the circumference of the circle with that radius.\n");

        System.out.println("Please enter the value of the radius.");
        double radius = scan.nextDouble();
        double area = Math.PI * Math.pow(radius,2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("Given a circle with radius " + radius + ":\n" +
                "The area of the circle is " + area + "\n" +
                "The circumference of the circle is " + circumference);
    }
}
