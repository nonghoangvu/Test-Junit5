package com.vunh.service;

import com.vunh.entities.BaiHat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodControllerTest {

    //01
    //Limit: a > 0 And a < 10
    //Limit: b > 0 And b < 10
    @Test
    void testMathDi01() {//TH1: Thanh cong
        assertEquals(1, MethodController.MathDiv(2, 2));
    }

    @Test
    void testMathDiv02() {//TH: a > bien min
        assertEquals(0.5, MethodController.MathDiv(1, 2));
    }

    @Test
    void testMathDiv03() {//TH a < bien max
        assertEquals(4.5, MethodController.MathDiv(9, 2));
    }

    @Test
    void testMathDiv04() {//TH b < tuong duong max
        assertEquals(0.25, MethodController.MathDiv(2, 8));
    }

    @Test
    void testMathDiv05() {//TH b > tuong duong min
        assertEquals(1.8, MethodController.MathDiv(9, 5));
    }

    @Test
    void testMathDiv06() {//a = 0
        assertThrows(IllegalArgumentException.class, () -> MethodController.MathDiv(0, 5));
    }

    //02
    @Test
    void testNhan01() {
        assertEquals(2, Calculator.MathTime(1, 2));
    }

    @Test
    void testNhan02() {
        assertEquals(20, Calculator.MathTime(10, 2));
    }

    @Test
    void testChia03() {
        assertEquals(1, Calculator.MathDiv(2, 2));
    }

    @Test
    void testChia04() {
        assertEquals(5, Calculator.MathDiv(10, 2));
    }

    @Test
    void testChia05() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.MathDiv(10, 0));
    }

    //03
    @Test
    void testStudentGrader01() {
        assertEquals("A", StudentGrader.studentGrader(88));
    }

    @Test
    void testStudentGrader02() {
        assertEquals("F", StudentGrader.studentGrader(10));
    }

    @Test
    void testStudentGrader03() {
        assertEquals("C", StudentGrader.studentGrader(66));
    }

    @Test
    void testStudentGrader04() {
        assertEquals("B", StudentGrader.studentGrader(77));
    }

    @Test
    void testStudentGrader05() {
        assertEquals("F", StudentGrader.studentGrader(40));
    }

    //Add BaiHat
    private final BaiHatService service = new BaiHatService();

    @Test
    void testAdd01() {//Thanh Cong
        BaiHat baiHat = new BaiHat("1", "Bai Hat 1", "Vu", 1, "Nong Hoang Vu");
        assertTrue(this.service.add(baiHat));
    }

    @Test
    void testAdd02() {//Thanh tha bai: do dai < 0
        BaiHat baiHat = new BaiHat("1", "Bai Hat 1", "Vu", -1, "Nong Hoang Vu");
        assertFalse(service.add(baiHat));
    }
    @Test
    void testAdd03() {//Thanh tha bai: baiHat is null
        BaiHat baiHat = new BaiHat();
        assertFalse(service.add(baiHat));
    }
    @Test
    void testAdd04() {//Thanh tha bai: do dai qua lon
        BaiHat baiHat = new BaiHat("1", "Bai Hat 1", "Vu", 1000000000, "Nong Hoang Vu");
        assertFalse(service.add(baiHat));
    }
    @Test
    void testAdd05() {//Thanh tha bai: ten qua ngan
        BaiHat baiHat = new BaiHat("1", "B", "Vu", 1, "Nong Hoang Vu");
        assertFalse(service.add(baiHat));
    }

    //Delete
    @Test
    void testDelete01() {//Thanh Cong
        BaiHat baiHat = new BaiHat("1", "Bai Hat 1", "Vu", 1, "Nong Hoang Vu");
        this.service.add(baiHat);
        assertTrue(this.service.delete("1"));
    }

    @Test
    void testDelete02() {//ID not found
        assertFalse(this.service.delete("1"));
    }
    @Test
    void testDelete03() {//ID < 10
        BaiHat baiHat = new BaiHat("9", "Bai Hat 1", "Vu", 1, "Nong Hoang Vu");
        this.service.add(baiHat);
        assertTrue(this.service.delete("9"));
    }
    @Test
    void testDelete04() {//ID > 10
        BaiHat baiHat = new BaiHat("11", "Bai Hat 1", "Vu", 1, "Nong Hoang Vu");
        this.service.add(baiHat);
        assertTrue(this.service.delete("11"));
    }

    @Test
    void testDelete05() {//ID < 0
        BaiHat baiHat = new BaiHat("1", "Bai Hat 1", "Vu", 1, "Nong Hoang Vu");
        this.service.add(baiHat);
        assertFalse(this.service.delete("-1"));
    }
}