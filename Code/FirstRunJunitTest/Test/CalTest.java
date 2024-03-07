import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalTest extends Cal {

    @Test
    void testPlus() {
        var result = new Cal(5, 4).plus();
        var expected = 9;
        assertEquals(expected, result);
    }
}