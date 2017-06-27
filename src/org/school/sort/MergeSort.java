package org.school.sort;

public class MergeSort {
    public static void mergesort(int[] arr, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middleIndex = (rightEnd + leftStart) / 2;
        mergesort(arr, leftStart, middleIndex);
        mergesort(arr, middleIndex + 1, rightEnd);
        merge(arr, leftStart, rightEnd);
    }

    public static void merge(int[] arr, int leftStart, int rightEnd) {
        int[] tempArray = new int[arr.length];
        int size = rightEnd - leftStart + 1;
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;
        while (left <= leftEnd && right <= rightEnd) {
            if (arr[left] <= arr[right]) {
                tempArray[index] = arr[left];
                left++;
            } else {
                tempArray[index] = arr[right];
                right++;
            }
            index++;
        }
        System.arraycopy(arr, left, tempArray, index, leftEnd - left + 1);
        System.arraycopy(arr, right, tempArray, index, rightEnd - right + 1);
        System.arraycopy(tempArray, leftStart, arr, leftStart, size);

    }


    private static void printSortedArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2, 1};
        MergeSort.mergesort(arr, 0, arr.length - 1);
        MergeSort.printSortedArray(arr);
    }
}
