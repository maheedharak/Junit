package org.personal;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertAll(
                () -> assertEquals(2,mathUtils.add(1,1),"The method to test adding two numbers"),
                () -> assertEquals(1,mathUtils.add(0,1),"The method to test adding two numbers"),
                () -> assertEquals(0,mathUtils.add(-1,1),"The method to test adding two numbers"));
    }
    @Test
    public void divideExceptionTest(){
        assertThrows(ArithmeticException.class,() -> mathUtils.divide(1, 0));

    }

}