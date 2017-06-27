package org.school.divide;

public class SumDivideEtImpera {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 3, 2, 4, 6};
        System.out.println(SumDivideEtImpera.getSum(arr, 0, arr.length - 1));
    }

    private static int getSum(int[] ints, int left, int right) {
        if (left == right) {
            return ints[left];
        } else {
            int mid = (left + right) / 2;
            int s1 = getSum(ints, left, mid);
            int s2 = getSum(ints, mid + 1, right);
            return s1 + s2;
        }
    }
}
