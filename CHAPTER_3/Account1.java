import java.util.Scanner;

    public class Account1{
 
       String name;
       double balance;
       double depositAmount; 
       double withdraw;  

   public Account1(String name, double balance){
         this.name = name;
         this.balance = balance;  
    }    

   public void deposit(double depositAmount){

       balance = depositAmount + balance;
   }

    public void withdraw(double withdrawAmount){

     if (balance > withdrawAmount){
	balance = balance - withdrawAmount; 
}    
    else{
	System.out.println("The withdraw amount is greater than the balance!");
}
       
   }

   public double getBalance(){
         return balance;
   }

   public void setName(String name){
       this.name = name;
   }
  
   public String getName(){
         return name;

      }
)