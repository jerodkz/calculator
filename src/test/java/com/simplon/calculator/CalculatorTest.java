package com.simplon.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CalculatorTest {

    @Test
    public void addition_with_two_numbers() {
        //set
        Calculator calculator = new Calculator();
        // test
        int result = calculator.addition(1, 1);
        //assert
        assertEquals(2, result);
    }

    @Test
    public void subtraction_with_two_numbers() {
        //set
        Calculator calculator = new Calculator();
        //test
        int result = calculator.subtraction(2, 1);
        //assert
        assertEquals(1, result);
    }

    @Test
    public void divide_with_two_numbers() {
        //set
        Calculator calculator = new Calculator();
        //test
        float result = calculator.divide(4, 2);
        //assert
        assertEquals(2f, result);
    }

    @Test(expected = ArithmeticException.class)
    public void divide_with_zero() {
        //set
        Calculator calculator = new Calculator();
        //test
        float result = calculator.divide(5, 0);
        //assert
        //assertEquals(0f,result);
    }
}
