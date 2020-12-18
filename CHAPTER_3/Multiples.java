import java.util.Scanner;

public class Arithemetic {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        int product = number1 * number2;
        int difference = number1 / number2;
        int quotient = number1 % number2;

        if (number1 > 0 && number2 > 0) {
            sum = number1 + number2;
            product = number1 * number2;
            difference = number1 / number2;
            quotient = number1 % number2;

            System.out.printf("The sum is: %d%nproduct is: %d%ndifference is: %d%nquotient is: %d%n", sum, product, difference, quotient);

        }else{
                System.out.println("You entered invalid integer(s)");
            }
    }

}
