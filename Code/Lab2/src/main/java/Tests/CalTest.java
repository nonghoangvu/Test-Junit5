package Tests;

import com.vunh.lab2.Cal;
import org.junit.Assert;
import org.junit.Test;

public class CalTest {
    @Test
    public void testSumFirst() {
        Cal sumNumber = new Cal();
        int expected = 0;
        Assert.assertEquals(expected, sumNumber.methodSum(0, 0));
    }

    @Test
    public void testSumSecond() {
        Cal sumNumber = new Cal();
        int expected = 2147483647;
        Assert.assertEquals(expected, sumNumber.methodSum(2147483647, 0));
    }

    @Test
    public void testMulFirst() {
        Cal cal = new Cal();
        int expected = 1;
        Assert.assertEquals(expected, cal.methodMul(1, 1));
    }

    @Test
    public void testMulSecond() {
        Cal cal = new Cal();
        int expected = 0;
        Assert.assertEquals(expected, cal.methodMul(-1, 1));
    }

    @Test
    public void testFactorialFist(){
        Cal cal = new Cal();
        int expected = 120;
        Assert.assertEquals(expected, cal.methodCalFactorial(5));
    }

    @Test
    public void testFactorialSecond(){
        Cal cal = new Cal();
        int expected = 1;
        Assert.assertEquals(expected, cal.methodCalFactorial(6));
    }
}
