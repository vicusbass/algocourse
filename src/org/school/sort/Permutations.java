package org.school.sort;

public class Permutations {
    private static int n = 3;
    private static int[] stiva = new int[50];

    public static void main(String[] args) {
        permute(1);
    }

    private static void write() {
        for (int i = 1; i < n+1; i++) {
            System.out.print(stiva[i] + " ");
        }
        System.out.println();
    }

    private static boolean valid(int k) {
        for (int i = 1; i < k; i++) {
            if (stiva[i] == stiva[k]) return false;
        }
        return true;
    }

    private static void permute(int i) {
        for (int j = 1; j <= n; j++) {
            stiva[i] = j;
            if (valid(i)) {
                if (i == n) {
                    write();
                } else {
                    permute(i + 1);
                }
            }
        }

    }
}
