package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    Scanner scan = new Scanner(System.in);
    SecureRandom newRand = new SecureRandom();

    public void getMultiplicationExercise() {

        int rand = 1 + newRand.nextInt(20);
        int rand2 = 1 + newRand.nextInt(20);

        System.out.print("How much is " + rand + " times " + rand2 + "? ");
        int studentReply = scan.nextInt();
        int randMultiplied = rand * rand2;

        while (studentReply != randMultiplied) {
            System.out.println("No. Please try again.");

            System.out.print("How much is " + rand + " times " + rand2 + "? ");
            studentReply = scan.nextInt();
            randMultiplied = rand * rand2;
        }

            while (studentReply == randMultiplied) {
                System.out.println("Very good!");
                questionGetter();
            }
        }

    public void questionGetter(){

        int rand3 = 1 + newRand.nextInt(20);
        int rand4 = 1 + newRand.nextInt(20);

        System.out.print("How much is " + rand3 + " times " + rand4 + "? ");
        int studentReply = scan.nextInt();

        int randMultiplied = rand3 * rand4;
    }
}


