package TestCal;

import com.example.servlethelloworld.Cal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void testPlus(){
        Cal calculator = new Cal();
        var expected = 6;
        var result = calculator.plus(3, 3);
        assertEquals(expected, result);
    }

    @Test
    void testSub(){
        Cal calculator = new Cal();
        var expected = 0;
        var result = calculator.sub(3, 3);
        assertEquals(expected, result);
    }

    @Test
    void testMul(){
        Cal calculator = new Cal();
        var expected = 9;
        var result = calculator.mul(3, 3);
        assertEquals(expected, result);
    }

    @Test
    void testDiv(){
        Cal calculator = new Cal();
        var expected = 1;
        var result = calculator.div(3, 3);
        assertEquals(expected, result);
    }
}
