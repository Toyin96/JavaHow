import java.security.SecureRandom;
import java.util.Scanner;

public class RandomNumberGame {

    public static void main(String[] args) {


        SecureRandom randomGenerator = new SecureRandom();
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int newSum = 0;


        for (int counter = 1; counter <=2; counter++) {

            int randomValue = 1 + randomGenerator.nextInt(6);

            System.out.printf("rolling dice...: %d%n", randomValue);

            sum += randomValue;
        }

        if (sum == 7 || sum == 11){
            System.out.printf("YOU WON! YOUR POINT IS: %d%n", sum);
        }else {
            if (sum > 1 && sum < 4 || sum == 12) {
                System.out.printf("YOU LOSE. YOUR POINT IS: %d%n", sum);
            }
        }

        if (sum > 3 && sum < 11){
            System.out.printf("Your point is %d, continue playing...%n", sum);

            for (int counter = 1; counter <= 2; counter++) {

                int randomValue = 1 + randomGenerator.nextInt(6);

                System.out.printf("rolling dice: %d%n", randomValue);

                newSum += randomValue;
            }

            if (newSum == sum) {
                System.out.println("YOU MAKE YOUR POINT. CONGRATS!");
            }else {
                if (newSum == 7) {
                    System.out.println("YOU LOSE.");
                }
            }
        }
    }
}
