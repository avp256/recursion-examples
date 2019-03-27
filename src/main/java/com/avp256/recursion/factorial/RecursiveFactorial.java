package com.avp256.recursion.factorial;











public class RecursiveFactorial implements Factorial {
    public long calculate(long n) {
        if (n == 1) {
            return 1;
        }
        return calculate(n-1) * n;
    }
}
