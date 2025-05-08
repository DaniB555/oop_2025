package lab09_ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary{
    private ArrayList<String> words=new ArrayList<>();

    public ArrayListDictionary() {
        try(Scanner scanner=new Scanner(new File(DICTIONARY_FILE))){
            while (scanner.hasNextLine()){
                String Line=scanner.nextLine();
                add(Line);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(String word) {
        if (find(word)) return false;
        words.add(word);
        return true;
    }

    @Override
    public boolean find(String word) {
        //return words.contains(word);
        return Collections.binarySearch(words,word)>=0;
    }

    @Override
    public int size() {
        return 0;
    }
}
