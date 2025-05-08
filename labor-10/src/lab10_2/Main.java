package lab10_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<MyDate> dates = new ArrayList<>();
        Random rand=new Random();
        while (dates.size() != 10) {
            int year=2025;
            int month=rand.nextInt(12)+1;
            int day=rand.nextInt(31)+1;
            if (DateUtil.isValidDate(year,month,day)) {
                dates.add(new MyDate(year,month,day));
            }
        }

        for(MyDate date:dates){
            System.out.println(date);
        }

        Collections.sort(dates);
        System.out.println("Rendezett sorrend");
        for(MyDate date:dates){
            System.out.println(date);
        }
        Collections.sort(dates,(d1,d2)->{
            return d2.compareTo(d1);
        });
        System.out.println("forditott kronologiai sorrend");
        for(MyDate date:dates){
            System.out.println(date);
        }
    }

}
