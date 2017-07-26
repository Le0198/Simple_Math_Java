import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args){
        System.out.println("Welcome! This program takes in a temperature as input, and an input indicating\n" +
                "whether we're converting from Celsius to Fahrenheit or vise versa.");

        Scanner scan = new Scanner(System.in);
        System.out.println("\nPlease enter \"F\" if we are converting from Fahrenheit.\n" +
                "Otherwise, enter \"C\" if we are converting from Celsius.");

        String temp_key = scan.nextLine();

        System.out.println("Please enter the numerical value of the temperature.");

        double temp_value = scan.nextDouble();

        if(temp_key.equals("F"))
        {
            System.out.println("When converting " + temp_value + " from Fahrenheit to Celsius,\n" +
                    "the result is " + ((temp_value - 32) / 1.8));
        }
        else
        {
            System.out.println("When converting " + temp_value + " from Celsius to Fahrenheit,\n" +
                    "the result is " + ((temp_value * 1.8) + 32));
        }
    }
}
