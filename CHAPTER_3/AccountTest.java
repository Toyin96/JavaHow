// A public class    
  
 import java.util.Scanner;
   
 public class AccountTest
{
       public static void main(String[] args){

       Scanner input = new Scanner(System.in);
   
       Account toyinAccount = new Account();

       System.out.printf("You default account name is: %s%n", toyinAccount.getAccountName());

       String newName;
       
       System.out.println("please enter the new name you want on your account: ");
       newName = input.nextLine();

       toyinAccount.setAccountName(newName);
      
       System.out.printf("You account name has been updated to: %s%n", toyinAccount.getAccountName());
       
       } end main method
       

} // end class AccountTest