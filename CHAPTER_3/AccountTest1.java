import java.util.Scanner;

   public class AccountTest1{

     public static void main(String[] args){
     
     Account1 account2 = new Account1("Jane's account", 3000);

    System.out.printf("Your initial balance is: %f%n ", account2.getBalance());
     
    Scanner input = new Scanner(System.in);
     
    System.out.println("Enter amount to deposit: ");
       double deposit = input.nextDouble();
       account2.deposit(deposit);

     System.out.printf("Your balance is: %f%n ", account2.getBalance());  

       System.out.println("Enter amount to withdraw: ");
       double withdraw = input.nextDouble();
       account2.withdraw(withdraw);

       
    System.out.printf("your remaining balance: %f%n", account2.getBalance());

    }

}