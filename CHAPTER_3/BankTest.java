import java.util.Scanner;

     public class BankTest{
	    
        public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		 
		 Bank toyinBank = new Bank("toyinAccount", 5000);
		 
		   System.out.printf("Your default account balance is: %.2f%n", toyinBank.getBalance());
		      
			 System.out.printf("Enter your deposit amount: ");
                  
              double deposit = input.nextDouble();
                
              toyinBank.deposit(deposit);	

        System.out.printf("Your new account balance is: %.2f%n", toyinBank.getBalance());			  
	    
		System.out.printf("	Enter your withdrawal amount: ");
		    double withdraw = input.nextDouble();
			toyinBank.withdraw(withdraw);
			
		System.out.printf("	Your new balance is: %.2f%n", toyinBank.getBalance());  
	        
        }
	 
	 }
