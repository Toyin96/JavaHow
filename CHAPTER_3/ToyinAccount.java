// An accounting program

public class ToyinAccount{
   
    private String name;
    private double balance;

   public ToyinAccount(String name, double balance){
         this.name = name;
         this.balance = balance;
    }

 public void deposit(double depositAmount){
    balance = depositAmount + balance;
    }
    
    public void withdraw(double withdrawalAmount){
    
      if (withdrawalAmount < balance)
      balance = balance - withdrawalAmount;
    
      else
      System.out.println("Sorry, you have insufficient amount to perform this transaction!");
    
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

}