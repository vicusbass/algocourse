package org.school.divide;

public class SumDivideEtImpera {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 3, 2, 4, 6};
        System.out.println("Sum: " + SumDivideEtImpera.getSum(arr, 0, arr.length - 1));
        System.out.println("Min: " + SumDivideEtImpera.getMin(arr, 0, arr.length - 1));
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

    private static int getMin(int[] ints, int left, int right) {
        if (left == right) {
            return ints[left];
        } else {
            int mid = (left + right) / 2;
            int min1 = getMin(ints, left, mid);
            int min2 = getMin(ints, mid + 1, right);
            return min1 < min2 ? min1 : min2;
        }
    }
}
