package lab10_3;

import lab10_3.MyDate;

public class Employee {
    private final int ID;
    private String firstName;
    private String lastName;
    private double salary;
    private MyDate birthDate;
    private static int counter=1;

    public Employee(String firstName, String lastName, double salary, MyDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        ID=counter;
        counter++;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", birthDate=" + birthDate +
                '}';
    }
}
