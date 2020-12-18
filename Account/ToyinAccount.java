import java.util.Scanner;

public class ToyinAccount{

    public static void main(String[] args){

    Account2 account = new Account2();

    Scanner input = new Scanner(System.in);

    System.out.println("Your current account balance is: " + account.getAccountBalance());
   
    int deposit;

    System.out.print("How much do you want to deposit?: ");
    deposit = input.nextInt();
    
    int newBalance;
    newBalance = deposit;
       
    account.setAccountBalance(newBalance);

    System.out.printf("Congratulations! you have successfully deposited money into your account and your new balance is %d%n", account.getAccountBalance());
    
    }

}