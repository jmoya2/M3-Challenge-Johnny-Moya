package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldDividePositives() {

        assertEquals(3, calc.divide(6,2));
        assertEquals(2, calc.divide(80, 39));
        assertEquals(1, calc.divide(105, 100));
    }

    @Test
    public void shouldDivideNegatives() {

        assertEquals(3, calc.divide(-6,-2));
        assertEquals(2, calc.divide(-80, -39));
        assertEquals(1, calc.divide(-105, -100));
    }

    @Test
    public void shouldDivideBothPosAndNeg() {
        assertEquals(-3, calc.divide(6,-2));
        assertEquals(-2, calc.divide(-80, 39));
        assertEquals(-1, calc.divide(105, -100));
    }

    @Test
    public void shouldReturnZero() {
        assertEquals(0, calc.divide(0,0));
        assertEquals(0, calc.divide(0, 1));
        assertEquals(0, calc.divide(105, 0));
    }

    @Test
    public void shouldAddPositives() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void shouldAddNegatives() {
        assertEquals(-10, calc.add(-6, -4));
    }

    @Test
    public void shouldAddBothPosAndNeg() {
        assertEquals(2, calc.add(6, -4));
    }

    @Test
    public void shouldAddZero() {
        assertEquals(2, calc.add(0, 2));
        assertEquals(-1, calc.add(-1, 0));
        assertEquals(0, calc.add(0, 0));
    }

    @Test
    public void shouldSubtractPositives() {
        assertEquals(1, calc.subtract(3, 2));
        assertEquals(-1, calc.subtract(2, 3));
    }

    @Test
    public void shouldSubtractNegatives() {
        assertEquals(-1, calc.subtract(-3, -2));
        assertEquals(1, calc.subtract(-2, -3));
    }

    @Test
    public void shouldSubtractBothPosAndNeg() {
        assertEquals(-6, calc.subtract(-5, 1));
        assertEquals(6, calc.subtract(1, -5));
    }

    @Test
    public void shouldSubtractZero() {
        assertEquals(-1, calc.subtract(0, 1));
        assertEquals(2, calc.subtract(2, 0));
        assertEquals(0, calc.subtract(0, 0));
    }

    @Test
    public void shouldMultiplyPositives() {
        assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void shouldMultiplyNegatives() {
        assertEquals(8, calc.multiply(-2, -4));
    }

    @Test
    public void shouldMultiplyBothPosAndNeg() {
        assertEquals(-3, calc.multiply(1, -3));
    }

    @Test
    public void shouldMultiplyZero() {
        assertEquals(0, calc.multiply(0, 2));
        assertEquals(0, calc.multiply(-1, 0));
        assertEquals(0, calc.multiply(0, 0));
    }
}
