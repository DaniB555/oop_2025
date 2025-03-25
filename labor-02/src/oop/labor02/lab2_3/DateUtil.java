package lab2_3;

public class DateUtil {
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static boolean isValidDate(int year, int month, int day) {
        if(year<0 || month<0 || day<0 || month>12 || day>29){
            return false;
        }
        return true;
    }
}
