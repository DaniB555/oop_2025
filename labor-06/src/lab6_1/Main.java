package lab6_1;

public class Main {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount();
        //System.out.println(account1);
        BankAccount account2=new BankAccount();
        account2.deposit(200);
        account2.withdraw(100);
       // System.out.println(account2);
        Customer customer1=new Customer("Bartos","Daniel");
        Customer customer2=new Customer("Molnar","Norbert");
        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer2.addAccount(account1);
        customer2.addAccount(account2);
       // System.out.println(customer1.getAccountNumbers());
        Bank bank1=new Bank("OTP");
        bank1.addCustomer(customer1);
        bank1.addCustomer(customer2);

        bank1.getCustomer(1).getAccount("BT00000001").deposit(550);

        System.out.println(bank1.getCustomer(1));


    }
}
