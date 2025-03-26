package lab6_1;

import java.util.ArrayList;

public class Customer {
    private static int numCustomer;
    private final int id;
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts=new ArrayList<>();

    public Customer(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id=++numCustomer;
    }


    public void addAccount(BankAccount accountnew){
        accounts.add(accountnew);
    }
    public ArrayList<String> getAccountNumbers(){
        ArrayList<String> accontNumbers=new ArrayList<>();
        for (BankAccount a:accounts){
accontNumbers.add(a.getAccountNumber());
        }
        return accontNumbers;
    }
    public int getId() {
        return id;
    }

    public int getNumAccounts() {
        return accounts.size();
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BankAccount getAccount(String accountNumber){
        for(BankAccount a:accounts){
            if (a.getAccountNumber().equals(accountNumber)) return a;
        }
        return null;

    }
    public void closeAccount(String accountNumber){
        for(BankAccount a:accounts){
            if (a.getAccountNumber().equals(accountNumber)) accounts.remove(a);
        }
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
