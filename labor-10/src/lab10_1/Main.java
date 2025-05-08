package lab10_1;

public class Main {
    public static void main(String[] args) {
        SortingDemo demo=new SortingDemo("labor-10/fruits.txt");
        demo.printFruits();
        System.out.println("Alphabetically sorted data:");
        demo.sortAlphabetically();
        demo.printFruits();
        System.out.println("reversedAlphabetial sorted data:");
        demo.sortReverseAlphabetical();
        demo.printFruits();
    }
}
