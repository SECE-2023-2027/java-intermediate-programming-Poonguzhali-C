package Problem3;

public class BankAccount {
     private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid Deposit Amount");
        }
        else{
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance-=amount;
        }
    }
    
}
