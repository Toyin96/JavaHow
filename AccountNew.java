public class AccountNew{

    public static void main(String[] args){

   private double balance;
   private double deposit;
   private double withdraw;

    public double getBalance(){
      return balance;
    }

    public void setBalance(double balance){
      this.balance = balance;
    }

    public double withdraw(double withdrawalAmount){
      if (withdrawalAmount > balance){
      System.out.println("Withdrawal amount exceeded account balance.");
      }else{ 

       balance = balance - withdrawalAmount;

       }

      if (withdrawalAmount < 0){
      System.out.println("Withdrawal amount cannot be equal to or less than 0");

      } else{
     
     balance = balance - withdrawalAmount;
      
      }

     public double deposit(double depositAmount){
      if (depositAmount < 0){
      System.out.println("deposit amount cannot be less than 0");
      }else{ 

      balance = balance + depositAmount;

       }

       

     
    












}



}