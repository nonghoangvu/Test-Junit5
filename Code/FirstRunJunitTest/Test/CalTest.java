import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    @Test
    void testSum(){
        var cal = new Cal<>(5f, 4f);
        var numA = cal.getNumA();
        var numB = cal.getNumB();
        var expected = 9;
        var result = numA + numB;
        assertEquals(expected, result);
    }

}