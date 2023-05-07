package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void sum() {
        Assertions.assertEquals(1, sumCalculator.sum(1));
        Assertions.assertEquals(6, sumCalculator.sum(3));
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}