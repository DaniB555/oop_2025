package lab2_1;

public class Bankaccountm {
    private String accountnumber;
    private double balance;
    public Bankaccountm(String paccountnumber) {
        accountnumber = paccountnumber;
    }
    public String getAccountnumber() {
        return "Bankaccountm(" + accountnumber + ", " + balance + ")";    }
    public String getAccountNumber() {
        return accountnumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }
    public String toString() {
        return "Bankaccountm(" + accountnumber + ", " + balance + ")";
    }

}
