package Chapter6;

import java.util.Scanner;

public class DisplayingASquareOfAnyCharacter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character to print: ");
        int number = input.nextInt();
        char fill = input.next().charAt(0);
        System.out.println();

        fillCharacter(number,fill);

    }

    public static void fillCharacter (int number, char fill){

        for (int counter = 1; counter <= number; counter++){

            for (int i = 1; i <= number; i++){

                System.out.print(fill + "");
            }
            System.out.println();
        }

    }
}


