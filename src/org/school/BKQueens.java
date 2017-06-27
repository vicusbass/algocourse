package org.school;


public class BKQueens {
    static int[] a;
    static int n = 8;

    public static void write() {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void regina(int i) {
        if (i == n) {
            write();
        } else for (int l = 0; l < n; l++) {
            a[i] = l;
            boolean attack = false;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j] || Math.abs(a[i] - a[j]) == i - j) attack = true;
            }
            if (!attack) regina(i + 1);
        }

    }

    public static void main(String[] args) {
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
        regina(0);
    }


}
