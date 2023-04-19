package org.personal;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("While testing MathUtils")
class MathUtilsTest {
    MathUtils mathUtils;
    static double randomOldVal = 0d;
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
    @Tags({@Tag("SingleTest"),@Tag("MathTest")})
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

    @RepeatedTest(5)
    @Tag("RepeatedTest")
    public void getNewRandomValue(){
       double randomVal = mathUtils.randomValue();
       assertNotEquals(MathUtilsTest.randomOldVal, randomVal,() -> "Previous value should not be equal to current value");
        MathUtilsTest.randomOldVal = randomVal;
    }

}