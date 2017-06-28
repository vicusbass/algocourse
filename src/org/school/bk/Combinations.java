package org.school.bk;

public class Combinations {
    private static int n = 4;
    private static int k = 2;
    private static int[] stiva = new int[50];

    public static void main(String[] args) {
        combine(1);
    }

    private static void write() {
        for (int i = 1; i < k + 1; i++) {
            System.out.print(stiva[i] + " ");
        }
        System.out.println();
    }


    private static void combine(int x) {
        for (int i = stiva[x - 1] + 1; i <= n - k + x; i++) {
            stiva[x] = i;
            if (x == k) {
                write();
            } else {
                combine(x + 1);
            }
        }

    }
}
