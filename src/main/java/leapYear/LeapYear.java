package leapYear;

public class LeapYear {

    public static final int GREGORIAN_CALENDAR_INTRODUCED_YEAR = 1582;
    public static final int FOUR = 4;
    public static final int HUNDRED = 100;
    public static final int FOUR_HUNDRED = 400;

    public boolean isLeapYear(int year){
        if(year< GREGORIAN_CALENDAR_INTRODUCED_YEAR){
            return false;
        }else
            return (isMultipleOf400(year) || (isMultipleOf4(year) && !isMultipleOf100(year)));
    }

    private boolean isMultipleOf4(int year) {
        return year%FOUR == 0;
    }

    private boolean isMultipleOf100(int year) {
        return year%HUNDRED == 0;
    }

    private boolean isMultipleOf400(int year) {
        return year%FOUR_HUNDRED == 0;
    }
}
