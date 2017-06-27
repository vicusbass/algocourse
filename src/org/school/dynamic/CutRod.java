package org.school.dynamic;

public class CutRod {
    static int[] p = new int[]{1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
    static int[] memo = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    static int[] cuts=new int[10];
    static int counter=0;

    public static void main(String[] args) {
        System.out.println(cutRod(8));
        System.out.println(counter);
    }

    private static int cutRod(int n) {
        counter++;
        if (memo[n] > 0) return memo[n];
        int q = -1;
        if (n == 0) {
            q = 0;
        } else {
            for (int i = 1; i <= p.length; i++) {
                q = max(q, p[i - 1] + cutRod(n - 1));
            }
            memo[n] = q;
        }
        return q;
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }
}
