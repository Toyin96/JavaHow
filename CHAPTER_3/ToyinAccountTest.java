import java.util.Scanner;

public class ToyinAccountTest{

   public static void main(String [] args){

   Scanner userInput =  new Scanner(System.in);

   ToyinAccount test = new ToyinAccount("Toyin's account", 2000);

   System.out.printf("Your existing balance is: %.2f ", test.getBalance());

   System.out.println("Kindly enter your deposit amount: ");
   double money = userInput.nextDouble();
   test.deposit(money);

  
    System.out.printf("Your new balance is:  %.2f", test.getBalance());

    System.out.println("Want to make a withdrawal? Kindly enter your withdrawal amount here: ");
    withdraw = userInput.nextDouble();
    test.deposit(withdraw);

    System.out.printf("Your new balance is:  %.2f", test.getBalance()); 
   
    }

}