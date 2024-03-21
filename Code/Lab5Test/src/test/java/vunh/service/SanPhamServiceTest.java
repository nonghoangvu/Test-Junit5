package vunh.service;

import org.junit.jupiter.api.Test;
import vunh.entities.SanPham;


import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    private final SanPhamService list = new SanPhamService();

    /*-------------------------Add--------------------------*/
    @Test
    void testAddFirst() { //Add successfully
        SanPham sp = new SanPham("4", "SP004", "Product 4", 25.0f, "Red", "Large", 54);
        assertTrue(this.list.add(sp));
    }

    @Test
    void testAddSecond() { //Invalid quantity!
        SanPham sp = new SanPham("4", "SP004", "Product 4", 25.0f, "Red", "Large", 101);
        assertThrows(IllegalArgumentException.class, () -> this.list.add(sp));
    }

    @Test
    void testAddThird() { //Product code already exists!
        SanPham sp = new SanPham("4", "SP003", "Product 4", 25.0f, "Red", "Large", 101);
        assertThrows(IllegalArgumentException.class, () -> this.list.add(sp));
    }

    /*-------------------------Update--------------------------*/
    @Test
    void testUpdateFirst() { //Update successfully - new product name
        SanPham sp = new SanPham("2", "SP004", "Product 4", 25.0f, "Red", "Large", 54);
        assertTrue(this.list.update(sp));
    }

    @Test
    void testUpdateSecond() { //ID not found
        SanPham sp = new SanPham("4", "SP004", "Product 4", 25.0f, "Red", "Large", 54);
        assertThrows(IllegalArgumentException.class, () -> this.list.update(sp));
    }

    @Test
    void testUpdateThird() { //Product code already exists
        SanPham sp = new SanPham("2", "SP002", "Product 4", 25.0f, "Red", "Large", 54);
        assertThrows(IllegalArgumentException.class, () -> this.list.update(sp));
    }

    @Test
    void testUpdateFourth() { //Invalid quantity!
        SanPham sp = new SanPham("2", "SP004", "Product 4", 25.0f, "Red", "Large", 101);
        assertThrows(IllegalArgumentException.class, () -> this.list.update(sp));
    }

    @Test
    void testUpdateFifth() { //The code not start with SP
        SanPham sp = new SanPham("2", "AB004", "Product 4", 25.0f, "Red", "Large", 101);
        assertThrows(IllegalArgumentException.class, () -> this.list.update(sp));
    }

    /*-------------------------Delete--------------------------*/
    @Test
    void testDeleteFirst() { //Delete successfully
        assertEquals(true, this.list.delete("2"));
    }

    @Test
    void testDeleteSecond() { //ID not found
        assertThrows(IllegalArgumentException.class, () -> this.list.delete("4"));
    }
}