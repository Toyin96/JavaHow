public class Account2{
    
        private byte accountPin;
        private String accountNumber;
        private String accountName;
        private int accountBalance;

        public byte getAccountPin(){
        return accountPin;

        }
        
        public String getAccountNumber(){
        return accountNumber;

        }

        public String getAccountName(){
        return accountName;

        }

        public int getAccountBalance(){
        return accountBalance;

        }

        public void setAccountPin(byte accountPin){
        this.accountPin = accountPin;
  
        }

        public void setAccountName(String accountName){
        this.accountName = accountName;
  
        }

        public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
  
        }

        public void setAccountBalance(int accountBalance){
        this.accountBalance = accountBalance;
  
        }

     }