package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;
import org.personal.MathUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.*;

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
    @DisplayName("Method to test adding two numbers")
    public void addTest(){
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual,"The method to test adding two numbers");
    }
    @Test
    public void divideExceptionTest(){
        assertThrows(ArithmeticException.class,() -> mathUtils.divide(1, 0));

    }
    @Test
    @EnabledOnJre(JRE.JAVA_8)
    public void testToDisable(){
        System.out.println("Disabled method");
    }

    @Test
    public void testToAssume(){
        String javaHome = System.getProperty("JAVA_HOME");
        assumeTrue(javaHome != null && javaHome.equals("Java18"));
        System.out.println("Disabled method");
    }

}