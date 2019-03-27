package com.avp256.recursion.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    public void recursiveFactorialTest() {
        Factorial factorial = new RecursiveFactorial();
        assertEquals(3628800, factorial.calculate(10));
    }

    @Test
    public void iterativeFactorialTest() {
        Factorial factorial = new IterativeFactorial();
        assertEquals(3628800, factorial.calculate(10));
    }
}
