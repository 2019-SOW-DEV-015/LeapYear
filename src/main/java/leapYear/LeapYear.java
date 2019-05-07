package leapYear;

public class LeapYear {
    public boolean isLeapYear(int year){
        if(year<1582){
            return false;
        }else
            return (isMultipleOf400(year) || (isMultipleOf4(year) && !isMultipleOf100(year)));
    }

    private boolean isMultipleOf4(int year) {
        return year%4 == 0;
    }

    private boolean isMultipleOf100(int year) {
        return year%100 == 0;
    }

    private boolean isMultipleOf400(int year) {
        return year%400 == 0;
    }
}
