package Chapter6;

import java.util.Scanner;

public class FindTheMinimum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three floating point numbers: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();

        System.out.println();
        System.out.println(minimum3(num1, num2, num3) + " is the smallest number");
    }


    public static double minimum3(double num1, double num2, double num3) {

        return Math.min(num1, Math.min(num2, num3));
    }
}
