package org.personal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilsTest {
    @BeforeEach
    public void init(TestInfo testInfo, TestReporter testReporter){
         testReporter.publishEntry("Running method "+testInfo.getTestMethod() +" with display name "+testInfo.getDisplayName());
    }
    @Test
    public void addTest(){
        MathUtils mathUtils = new MathUtils();
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual,"The method to test adding two numbers");
    }
    @Test
    public void calculateCircleAreaTest(){
        MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653589793,mathUtils.calculateCircleArea(10));
    }

}