package org.school.dynamic;

public class FibonacciDynamic {
    static int[] cache;
    static int counter = 0;
    static int counterDyn = 0;

    public static void main(String[] args) {
        int n = 17;
        cache = new int[5000];
        System.out.println(fibonacci(n) + "  iterations: " + counter);
        System.out.println(fibonacciDyn(n) + "  iterations: " + counterDyn);

    }

    private static int fibonacci(int i) {
        counter++;
        if (i == 0) return 0;
        if (i == 1) return 1;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    private static int fibonacciDyn(int i) {
        counterDyn++;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (cache[i] > 0) return cache[i];
        cache[i] = fibonacci(i - 1) + fibonacci(i - 2);
        return cache[i];
    }
}
