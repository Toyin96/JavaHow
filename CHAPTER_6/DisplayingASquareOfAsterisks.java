package Chapter6;

import java.util.Scanner;

public class DisplayingASquareOfAsterisks {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        System.out.println();

        squareOfAsterisksMaker(num);
    }

    public static void squareOfAsterisksMaker(int number) {

        for (int counter = 1; counter <= number; counter++){
            for (int i = 1; i <= number; i++){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
