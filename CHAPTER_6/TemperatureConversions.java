package Chapter6;

import java.util.Scanner;

public class TemperatureConversions {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the action you wish to perform: \n1. Convert Celsius to Fahrenheit\n2. Convert Fahrenheit to Celsius\n\nResponse: ");
        int userResponse = scan.nextByte();

        inputCollector(userResponse);
    }


    public static double celsius(double fahrenheitValue) {

        double celsius = 5.0 / 9.0 * (fahrenheitValue - 32);

        return celsius;
    }

    public static double fahrenheit(double celsius) {

        double fahrenheit = 9.0 / 5.0 * celsius + 32;

        return fahrenheit;
    }

    public static void inputCollector(double userResponse) {
        Scanner scan = new Scanner(System.in);

        if (userResponse == 1){
            System.out.print("Enter the degree you wish to convert: ");
            double degree = scan.nextDouble();

            System.out.printf("%n%.2f°C has been converted to %.2f°F", degree,fahrenheit(degree));
        }else{
            System.out.print("Enter the degree you wish to convert: ");
            double degree2 = scan.nextDouble();

            System.out.printf("%n%.2f°F has been converted to %.2f°C", degree2,celsius(degree2));
        }
    }
}
