package org.school.recursive;

import java.util.Scanner;

public class Factorial {
    private static long factorial(long n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);

    }

    public static void main(String[] args) {
        System.out.print("Enter value: ");
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        System.out.println(factorial(val));
    }
}
