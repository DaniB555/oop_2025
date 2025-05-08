package oop.labor11;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
    ArrayList<Product>products=new ArrayList<>();
    public Storage(String filename){
        try(Scanner scanner=new Scanner(new File(filename))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data=line.split( " ");
                products.add(new Product(Integer.parseInt(data[0].trim()),data[1].trim(),Integer.parseInt(data[2].trim()),Integer.parseInt(data[3].trim())));

            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private int binarySearch(int e, int v, int id) {
        if (e > v) return -1;
        int mid = (e + v) / 2;
        int productId = products.get(mid).getId();
        if (productId == id) return mid;
        else if (productId > id) return binarySearch(e, mid - 1, id);
        else return binarySearch(mid + 1, v, id);
    }


    public int update(String filename){
        int c=0;
        try(Scanner scanner=new Scanner(new File(filename))){
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                String[] update=line.split(" ");
                int updateId=Integer.parseInt(update[0].trim());
                int num=Integer.parseInt(update[1].trim());
                int index=binarySearch(0,products.size()-1,updateId);

                if (index != -1) {
                    products.get(index).increaseAmount(num);
                    c++;
            }}

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return c;
    }

}
