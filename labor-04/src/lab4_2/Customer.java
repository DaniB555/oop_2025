package lab4_2;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts=new ArrayList<>();

    }
    public int getNumAccounts(){
        return accounts.size();
    }
    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
public void closeAccount(String accountNumber){
for (BankAccount account : accounts){
    if(account.getAccountNumber()==accountNumber) {accounts.remove(account);break;}
}
}
    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
