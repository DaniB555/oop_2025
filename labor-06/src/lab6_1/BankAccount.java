package lab6_1;

public class BankAccount {
    public static final String PREFIX="BT";
    public static final int ACCOUNT_NUMBER_LENGTH=10;
    private static int numAccounts;
    private final String accountNumber;
    private double balance;

    public BankAccount() {
        numAccounts+=1;
        accountNumber=createAccountNumber();
    }
    private static String createAccountNumber(){
        return PREFIX+String.format("%08d",numAccounts);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }
    public boolean withdraw(double amount){
        if(balance>amount) {
            balance-=amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
