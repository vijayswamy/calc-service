package com.daas.calc.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcControllerTest {
    CalcController calcController = new CalcController();

   @Test
    public void testApp() {
        String str = calcController.test();
        assertEquals(true,str instanceof String);
    }  
  
    /*
  @Test
    public void testAddition() {
        int sum = calcController.add(2,3);
        assertEquals(5,sum );

    }
    
    @Test
    public void testDifference() {
        int diff = calcService.difference(15,10);
        assertEquals(5,diff );
    }
    @Test
    public void testMultiply() {
        int prod = calcService.multiply(2,3);
        assertEquals(6,prod );
    }

    @Test
    public void testDivision() {
        int quot = calcService.divide(15,3);
        assertEquals(5,quot );

    }*/


}
