package lab10_2;

public class DateUtil {
    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {

        if (month < 1 || month > 12 || day < 1 || year < 1) {
            return false;
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (leapYear(year)) {
            daysInMonth[1] = 29; // February has 29 days in a leap year
        }

        return day <= daysInMonth[month - 1];
    }
}