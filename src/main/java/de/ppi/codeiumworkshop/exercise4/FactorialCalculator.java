package de.ppi.codeiumworkshop.exercise4;

import java.util.ArrayList;
import java.util.List;

public class FactorialCalculator {

    // Method to calculate factorial using recursion
    public long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // Method to calculate factorial using iteration
    public long factorialIterative(int n) {
        List<Long> results = new ArrayList<>();
        results.add(1L);  // 0! = 1

        for (int i = 1; i <= n; i++) {
            long result = 1;
            for (int j = 1; j <= i; j++) {
                result *= j;
            }
            results.add(result);
        }

        return results.get(n);
    }

}
