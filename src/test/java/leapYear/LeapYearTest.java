package leapYear;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTest {
    private LeapYear leapYear;

    @Before
    public void setUp() throws Exception{
        leapYear = new LeapYear();
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy400_shouldReturnTrue(){
        boolean isLeap = leapYear.isLeapYear(2000);

        assertTrue(isLeap);
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy100ButNotBy400_shouldReturnFalse(){
        boolean isLeap = leapYear.isLeapYear(2100);

        assertFalse(isLeap);
    }
}
