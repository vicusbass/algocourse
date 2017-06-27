package org.school.recursive;

public class ArraySumRecursive {
    private static int[] ints = new int[]{2, 4, 6, 8, 9};
    private static int sum = 0;

    public static void main(String[] args) {
        System.out.println(sumRecursive(0));
    }

    private static int sumRecursive(int index) {
        if (index == ints.length) return sum;
        sum += ints[index];
        return sumRecursive(index + 1);
    }
}
