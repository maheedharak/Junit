package org.personal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    public void addTest(){
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual,"The method to test adding two numbers");
    }
    @Test
    public void divideExceptionTest(){
        MathUtils mathUtils = new MathUtils();
        assertThrows(ArithmeticException.class,() -> mathUtils.divide(1, 0));

    }

}