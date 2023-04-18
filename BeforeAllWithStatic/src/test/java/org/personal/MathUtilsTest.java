package org.personal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilsTest {
    MathUtils mathUtils;
    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all class execution");
    }
    @BeforeEach
    void init(){
        mathUtils = new MathUtils();
    }

    @Test
    public void addTest(){
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual,"The method to test adding two numbers");
    }
    @Test
    public void divideExceptionTest(){
        assertThrows(ArithmeticException.class,() -> mathUtils.divide(1, 0));

    }

}