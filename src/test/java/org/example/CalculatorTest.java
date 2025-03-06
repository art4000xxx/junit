package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    @Test
    public void testAdd_positiveNumbers_success() {
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;
        int result = calculator.add(a, b);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testAdd_negativeNumbers_success() {
        Calculator calculator = new Calculator();
        int a = -2;
        int b = -3;
        int result = calculator.add(a, b);
        Assertions.assertEquals(-5, result);
    }

    @Test
    public void testAdd_zeroAndPositive_success() {
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 5;
        int result = calculator.add(a, b);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testAdd_positiveAndNegative_success() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = -5;
        int result = calculator.add(a, b);
        Assertions.assertEquals(5, result);
    }
}