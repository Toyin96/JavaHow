package Chapter6;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius value: ");
        double radius = scan.nextDouble();

        double result = circleArea(radius);

        System.out.printf("%s%.2f%n","The area of the circle is: ", result);
    }


    public static double circleArea(double radius) {
        double power = Math.pow(radius, 2);

        return Math.PI * power;
    }
}
