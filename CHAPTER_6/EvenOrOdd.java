package Chapter6;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        System.out.println("This application returns \"True\" for Even numbers and \"False\" for Odd Numbers.");

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <10; i++){
            System.out.print("Enter an integer to check: ");
            int num = scan.nextInt();

            System.out.println(isEven(num));
        }
        System.out.println();
        System.out.println("Thanks for your time \uD83D\uDE0A");
    }

    public static boolean isEven(int num) {

        return num % 2 == 0;
    }
}
