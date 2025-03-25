package lab2_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int sumarea=0;
        Rectangle[] rectangles = new Rectangle[10];
        Random rand = new Random();
        for (int i = 0; i < rectangles.length; i++) {
            int length = 1+rand.nextInt(10);
            int width = 1+rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);
            System.out.println("Rectangles:"+"length="+rectangles[i].getLength()+",width="+rectangles[i].getWidth() +", Aria:"+rectangles[i].Area()+", Perimeter:"+rectangles[i].Perimeter());
            sumarea+=rectangles[i].Area();
        }
        System.out.println("Sum area: "+sumarea);
    }
}
