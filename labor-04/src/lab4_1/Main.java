package lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readFromTextFile("beolvas.txt");
    }
    public static void readFromTextFile(String filename){
        try(Scanner scanner = new Scanner(new File(filename))){
            int lineCounter=0;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                lineCounter++;
                System.out.println(lineCounter +" "+line);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
