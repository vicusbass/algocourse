package org.school.sort;

public class BubbleSort {
    private static int counter = 0;

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 12, 5, 6};


        arr = bubbleSort(arr);
        System.out.println("Operations: " + counter);
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    private static int[] bubbleSort(int[] arr) {
        int size = arr.length;
        boolean swapped;
        for (int i = 0; i < size; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                counter++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) return arr;
        }

        return arr;
    }
}
