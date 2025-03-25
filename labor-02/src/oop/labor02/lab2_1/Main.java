package lab2_1;

public class Main {
    public static void main(String[] args) {
        Bankaccountm bankaccount1=new Bankaccountm("OTP1");
        System.out.println("Initial state"+bankaccount1.toString());
    bankaccount1.deposit(100);
    System.out.println("Deposit amount : 100 "+bankaccount1);
    if (bankaccount1.withdraw(500)) {
        System.out.println("After withdraw amount : 500 "+bankaccount1);
    }
    else {
        System.out.println("After withdraw amount : 500 "+"Insufficient founds"+bankaccount1);
    }
    bankaccount1.withdraw(500);
    Bankaccountm bankaccount2=new Bankaccountm("OTP00002");
    System.out.println("Initial state"+bankaccount2.toString());
    bankaccount2.deposit(2000);
    System.out.println("Deposit amount : 2000 "+bankaccount2);

    }
}
