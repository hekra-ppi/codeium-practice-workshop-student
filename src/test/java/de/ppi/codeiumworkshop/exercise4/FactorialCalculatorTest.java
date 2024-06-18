package de.ppi.codeiumworkshop.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class FactorialCalculatorTest {
    private FactorialCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new FactorialCalculator();
    }

    @Test
    public void testFactorialRecursive() {
        assertEquals(1, calculator.factorialRecursive(0));
        assertEquals(1, calculator.factorialRecursive(1));
        assertEquals(2, calculator.factorialRecursive(2));
        assertEquals(6, calculator.factorialRecursive(3));
        assertEquals(24, calculator.factorialRecursive(4));
        assertEquals(120, calculator.factorialRecursive(5));
    }

    @Test
    public void testFactorialIterative() {
        assertEquals(1, calculator.factorialIterative(0));
        assertEquals(1, calculator.factorialIterative(1));
        assertEquals(2, calculator.factorialIterative(2));
        assertEquals(6, calculator.factorialIterative(3));
        assertEquals(24, calculator.factorialIterative(4));
        assertEquals(120, calculator.factorialIterative(5));
    }

}