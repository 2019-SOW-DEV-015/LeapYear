package leapYear;

public class LeapYear {
    private static final int GREGORIAN_CALENDAR_INTRODUCED_YEAR = 1582;
    private static final int FOUR = 4;
    private static final int HUNDRED = 100;
    private static final int FOUR_HUNDRED = 400;
    private static final int FOUR_THOUSAND = 4000;

    public boolean isLeapYear(int year){
        if(year< GREGORIAN_CALENDAR_INTRODUCED_YEAR)
            return false;
        else
            return ((isMultipleOf400(year) && isNotMultipleOf4000(year)) || (isMultipleOf4(year) && isNotMultipleOf100(year) && isNotMultipleOf4000(year)));
    }

    private boolean isMultipleOf4(int year) {
        return year%FOUR == 0;
    }

    private boolean isNotMultipleOf100(int year) {
        return year%HUNDRED != 0;
    }

    private boolean isMultipleOf400(int year) {
        return year%FOUR_HUNDRED == 0;
    }

    private boolean isNotMultipleOf4000(int year) {
        return year%FOUR_THOUSAND != 0;
    }
}
