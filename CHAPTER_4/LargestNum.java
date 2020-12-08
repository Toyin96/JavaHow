// A java program for checking the largest number among ten inputs
// This program was written by Sir Toyin M. Onagoruwa at exactly 2:00 AM, 22/11/2020.

import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {


        int counter = 1;
        int number;
        int largest = 0;
        int temp = 0;

        Scanner userInput = new Scanner(System.in);

        while (counter <= 10) {
            System.out.println("Enter number: ");
            number = userInput.nextInt();
            if (number > temp) {
                temp = number;
            }
            counter += 1;

            if (temp > largest) {
                largest = temp;
            }
        }
        System.out.printf("%s is the largest number%n", largest);

    }
}
