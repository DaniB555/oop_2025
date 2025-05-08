package lab10_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee>emps=new ArrayList<>();
    public Company(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void hire(Employee e){
    emps.add(e);
    }
    public void hireAll(String filename){
        try (Scanner scanner=new Scanner(new File(filename))){
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                String[] parts = line.split(",\\s*");
                String firstName = parts[0];
                String lastName = parts[1];
                double salary = Double.parseDouble(parts[2]);
                int year = Integer.parseInt(parts[3]);
                int month = Integer.parseInt(parts[4]);
                int day = Integer.parseInt(parts[5]);
                MyDate birthDate = new MyDate(year, month, day);
                if (parts.length == 7) {
                    String department = parts[6];
                    emps.add(new Manager(firstName, lastName, salary, birthDate, department));
                } else {
                    emps.add(new Employee(firstName, lastName, salary, birthDate));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
    public void fire(int id){
        emps.remove(id-1);
    }
    public void printAll(){
        for(Employee e:emps){
            System.out.println(e);
        }
    }
    public void printManagers(){
        for (Employee e:emps){
            if (e instanceof Manager){
                System.out.println(e);
            }
        }
    }
        public void sortByComparator(){
            Collections.sort(emps,(e1,e2)->{
                return e2.getFirstName().compareTo(e1.getFirstName());
            });
        }

    }
