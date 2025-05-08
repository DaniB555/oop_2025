package lab10_3;

import lab10_3.MyDate;

public class Main {
    public static void main(String[] args) {
        Employee emp1=new Employee("Bartos","Daniel",23,new MyDate(2004,12,18));
        //System.out.println(emp1.toString());
        Manager manager1=new Manager("Molnar","Norbert",12,new MyDate(2003,12,11),"szapi");
        //System.out.println(manager1.toString());
        Company comp=new Company("lynx");
        comp.hire(emp1);
        comp.hire(manager1);
        comp.hireAll("labor-10/employees.csv");
        comp.fire(1);
        comp.printAll();
        System.out.println("the Managers are:\n");
        comp.printManagers();
        System.out.println();
        comp.sortByComparator();
        comp.printAll();

    }
}
