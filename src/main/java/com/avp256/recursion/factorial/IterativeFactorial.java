package com.avp256.recursion.factorial;












public class IterativeFactorial implements Factorial {
    public long calculate(long n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
