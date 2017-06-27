package org.school.recursive;

import java.util.Scanner;

public class Fibonacci {
    static long fibonacci(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);

    }

    public static void main(String[] args) {
        System.out.print("Enter value: ");
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        System.out.println(fibonacci(val));
    }
}
