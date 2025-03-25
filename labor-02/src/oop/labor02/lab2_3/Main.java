package lab2_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(DateUtil.isLeapYear(2000));
        Random rand = new Random();
        int y,m,d;
        for(int i=1;i<=20;i++) {
            y = rand.nextInt(3000) + 2000;
            m = rand.nextInt(12) + 1;
            d = rand.nextInt(31) + 1;
            System.out.println("y:"+y+" m:"+m+" d:"+d+"isvalid?"+DateUtil.isValidDate(y, m, d));
            System.out.println();
        }
    }
}
