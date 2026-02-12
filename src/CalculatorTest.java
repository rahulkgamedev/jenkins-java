package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testAdd() {
        assertEquals(15, Calculator.add(10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, Calculator.subtract(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, Calculator.multiply(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, Calculator.divide(10, 5));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Calculator.divide(10, 0);
        });
    }
}
