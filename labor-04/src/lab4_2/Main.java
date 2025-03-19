package lab4_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John", "Doe");

        ArrayList<BankAccount> accountList = new ArrayList<>();
        accountList.add(new BankAccount("111111"));
        accountList.add(new BankAccount("222222"));
        accountList.add(new BankAccount("333333"));

        for (BankAccount account : accountList) {
            customer.addAccount(account);
        }

        System.out.println("Ügyfél adatai: " + customer);
        System.out.println("Bankszámlák száma: " + customer.getNumAccounts());

        customer.closeAccount("222222");

        System.out.println("Frissített ügyfél adatok: " + customer);
        System.out.println("Bankszámlák száma: " + customer.getNumAccounts());
    }
}
