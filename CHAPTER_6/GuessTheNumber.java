package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {


    public void numberGuesser() {

        Scanner scan = new Scanner(System.in);
        SecureRandom newRand = new SecureRandom();
        int randGenerator = 1 + newRand.nextInt(1000);

            System.out.print("Guess a number between 1 - 1000: ");
            int number = scan.nextInt();

        if (number <= 1000) {

        while (number != randGenerator){

            System.out.print("Guess a number between 1 - 1000: ");
            number = scan.nextInt();

            if (number > randGenerator){
                System.out.println("Too high. Try again.");
            }else{
                if (number < randGenerator){
                    System.out.println("Too low. Try again");
                }else{
                    if (number == randGenerator){
                        System.out.println("Congratulations. You guessed the number!");

                        System.out.println("Do you wish to play again? \n1. YES (enter 1)\n2. NO (enter 2)");
                        int reply = scan.nextByte();

                        if (reply == 1){
                            System.out.print("Guess a number between 1 - 1000: ");
                            number = scan.nextInt();
                            continue;
                        }else {
                            System.out.println("Thanks for playing this game...");
                            break;
                        }
                    }
                }
            }
            randGenerator = 1 + newRand.nextInt(1000);
            System.out.println(randGenerator);
        }
    }else{
            System.out.println("You entered a number greater than 1000");
        }
    }
}
