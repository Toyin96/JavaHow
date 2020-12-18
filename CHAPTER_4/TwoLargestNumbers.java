import java.util.Scanner;

public class TwoLargestNumbers {

    public static void main(String[] args) {

        int maximumNum = 0;
        int maximumNum2 = 0;
        int counter = 1;

        Scanner scan = new Scanner(System.in);

        while ( counter <= 4){
            System.out.print("Enter integer number for comparison: ");
            int userInput = scan.nextInt();

            if (userInput > maximumNum){
                maximumNum2 = maximumNum;
                maximumNum = userInput;
            }

            if (userInput < maximumNum && userInput > maximumNum2){
                    maximumNum2 = userInput;
            }
            counter++;
        }

        System.out.println(maximumNum + " is the highest number\n" + maximumNum2 + " is the second highest number\n");

    }
}