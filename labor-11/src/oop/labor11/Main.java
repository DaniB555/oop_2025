package oop.labor11;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 10; i < 10000000; i*=10) {
            String dataFile="data"+i+".txt";
            for (int j = 10; j < 1000000; j*=10) {
                String updateFile="update"+j+".txt";
                if (checkFile(dataFile)&& checkFile(updateFile)){
                    System.out.println("datafile: "+dataFile+" updatefile:"+ updateFile+" doIt:"+doIt(dataFile,updateFile));

                }
            }System.out.println();

        }
        
        /*System.out.println(checkFile("data10.txt"));*/
        /*System.out.println(doIt("labor-11/data/data10.txt","labor-11/data/update10.txt"));*/
    }
    private static boolean checkFile(String filename){
        try(Scanner scanner=new Scanner(new File(filename))) {
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }
    private static long doIt(String dataFile,String updateFile){
        long startMili=System.currentTimeMillis();
        Storage storage=new Storage(dataFile);

        System.out.println("ennyit updatelt: "+storage.update(updateFile));



        long stopMili=System.currentTimeMillis();
        return stopMili-startMili;
    }
}
