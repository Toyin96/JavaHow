public class CreditLimitCalculator {

    private String accountNumber;
    private int beginningBalance;
    private int totalItemsChargedThisMonth;
    private int totalCreditsAppliedToAccountThisMonth;
    private int creditLimit;


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBeginningBalance() {
        return beginningBalance;
    }

    public void setBeginningBalance(int beginningBalance) {
        this.beginningBalance = beginningBalance;
    }

    public int getTotalItemsChargedThisMonth() {
        return totalItemsChargedThisMonth;
    }

    public void setTotalItemsChargedThisMonth(int totalItemsChargedThisMonth) {
        this.totalItemsChargedThisMonth = totalItemsChargedThisMonth;
    }

    public int getTotalCreditsAppliedToAccountThisMonth() {
        return totalCreditsAppliedToAccountThisMonth;
    }

    public void setTotalCreditsAppliedToAccountThisMonth(int totalCreditsAppliedToAccountThisMonth) {
        this.totalCreditsAppliedToAccountThisMonth = totalCreditsAppliedToAccountThisMonth;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int newBalance() {
        int newBalance = beginningBalance + totalItemsChargedThisMonth - totalCreditsAppliedToAccountThisMonth;
        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        }

        return newBalance;


    }
}
