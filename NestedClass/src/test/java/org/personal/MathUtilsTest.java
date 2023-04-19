package org.personal;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("While testing MathUtils")
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

    @Nested
    @DisplayName(" add method")
    class AddTesting{
        @Test
        @DisplayName("for positive integers")
        public void addPositiveNumberTest(){
            assertEquals(2,mathUtils.add(1,1)," return value is incorrect");
        }
        @Test
        @DisplayName("for negative integers")
        public void addNegativeNumberTest(){
            assertEquals(0,mathUtils.add(-1,1)," return value is incorrect");
        }
    }
    @Test
    public void divideExceptionTest(){
        assertThrows(ArithmeticException.class,() -> mathUtils.divide(1, 0));

    }

}