import java.util.Scanner;

public class CreditLimitCalculatorTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CreditLimitCalculator newCalculator = new CreditLimitCalculator();

        System.out.println("Welcome new user! Enter your account number: ");
        newCalculator.setAccountNumber(input.next());

        System.out.println("Enter your initial account balance: ");
        newCalculator.setBeginningBalance(input.nextInt());

        System.out.println("Enter your credit limit: ");
        newCalculator.setCreditLimit(input.nextInt());

        System.out.println("Kindly enter the total of all items you were charged this month: ");
        newCalculator.setTotalItemsChargedThisMonth(input.nextInt());

        System.out.println("Enter the total credits applied to your account this month: ");
        newCalculator.setTotalCreditsAppliedToAccountThisMonth(input.nextInt());

        System.out.printf("You balance is: %d",newCalculator.newBalance());

    }
}
