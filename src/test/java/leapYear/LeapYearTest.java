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

    private boolean isLeapYear(int year) {
        return leapYear.isLeapYear(year);
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy400_shouldReturnTrue(){
        assertTrue(isLeapYear(2000));
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy100ButNotBy400_shouldReturnFalse(){
        assertFalse(isLeapYear(2100));
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy4ButNotBy100_shouldReturnTrue(){
        assertTrue(isLeapYear(2008));
    }

    @Test
    public void test_isLeapYear_whenNotDivisibleBy4_shouldReturnFalse(){
        assertFalse(isLeapYear(2019));
    }

    @Test
    public void test_isLeapYear_forInvalidYearLikeNegativeNumber_shouldReturnFalse(){
        assertFalse(isLeapYear(-1));
    }

    @Test
    public void test_isLeapYear_forYearBeforeGregorianCalendar1582_shouldReturnFalse(){
        assertFalse(isLeapYear(1580));
    }

    @Test
    public void test_isLeapYear_forInvalidYearLike0_shouldReturnFalse(){
        assertFalse(isLeapYear(0));
    }

    @Test
    public void test_isLeapYear_whenDivisibleBy4000_shouldReturnFalse(){
        assertFalse(isLeapYear(16000));
    }
}
