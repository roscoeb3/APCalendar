import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        System.out.println(APCalendar.numberOfLeapYears(2020,2028));
        System.out.println(APCalendar.firstDayOfYear(2019));
        System.out.println(APCalendar.dayOfYear(3, 1, 2017));
        System.out.println(APCalendar.dayOfYear(3, 1, 2016));
    }
}
