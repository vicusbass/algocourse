package org.school.sort;

public class QuickSort {
    public static void quickSort(int[] arr, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        //choose pivot
        int pivot = arr[(rightEnd + leftStart) / 2];
        int currentIdx = partition(arr, leftStart, rightEnd, pivot);
        quickSort(arr, leftStart, currentIdx - 1);
        quickSort(arr, currentIdx, rightEnd);
    }

    public static int partition(int[] arr, int leftStart, int rightEnd, int pivot) {
        int left = leftStart, right = rightEnd;
        while (left < right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;
            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }

    private static void printSortedArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 8, 4, 3, 2, 1};
        quickSort(arr, 0, arr.length - 1);
        printSortedArray(arr);
    }
}
