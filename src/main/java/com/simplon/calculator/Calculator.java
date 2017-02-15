package com.simplon.calculator;

/**
 * Created by jerome on 13/02/17.
 */
public class Calculator {
    public int addition(int number, int numberTwo) {
        return number + numberTwo;
    }

    public int subtraction(int number, int numberTwo) {
        return number - numberTwo;
    }

    public float divide(int number, int numberTwo) {
       try {
           return number / numberTwo;
       }
       catch(ArithmeticException){;}
    }
}
