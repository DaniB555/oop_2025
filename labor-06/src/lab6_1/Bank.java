package lab6_1;

import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> Bank = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public int numCustomers() {
        return Bank.size();
    }

    public void addCustomer(Customer customer) {
        Bank.add(customer);

    }

    public Customer getCustomer(int num) {
        for (Customer b : Bank) {
            if (num == b.getId()) return b;
        }
        return null;
    }


    private void printCustomers(PrintStream ps) {
        ps.println("ID, Firstname, Last name, Number of bank accounts");
        for (Customer customer : Bank) {
            ps.println(customer.getId() + ", " + customer.getFirstName() + ", " +
                    customer.getLastName() + ", " + customer.getNumAccounts());
        }
    }
    public void printCustomersToStdout() {
        printCustomers(System.out);
    }

    public void printCustomersToFile(String filename) {
        try (PrintStream out = new PrintStream(filename)) {
            printCustomers(out);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}