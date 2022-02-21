package com.company;

public class Task1 {
    public long sumSimpleNumbers(long upperLimit) {
        long sum = 0;
        for (long i = 2; i <= upperLimit; i++) {
            if (isNumberSimple(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private boolean isNumberSimple(long n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
