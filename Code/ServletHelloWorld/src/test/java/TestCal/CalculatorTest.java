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
    void testMul(){
        Cal calculator = new Cal();
        var expected = 0;
        var result = calculator.mul(3, 3);
        assertEquals(expected, result);
    }
}
