package lab09_ex2;

public interface IDictionary {
    final String DICTIONARY_FILE="dic.txt";
    boolean add(String word);
    boolean find(String word);
    int size();
}
