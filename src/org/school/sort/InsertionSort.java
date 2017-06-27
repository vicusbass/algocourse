package org.school.sort;

public class InsertionSort {
    private static int counter = 0;

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 4, 3, 2, 1};


        arr = insertionSort(arr);
        System.out.println("Operations: " + counter);
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    private static int[] insertionSort(int[] arr) {
        int size = arr.length;
        for (int i = 2; i < size; i++) {
            int curIndex = i;
            while (curIndex > 1 && arr[curIndex] < arr[curIndex - 1]) {
                counter++;
                int temp = arr[curIndex];
                arr[curIndex] = arr[curIndex - 1];
                arr[curIndex - 1] = temp;
                curIndex--;
            }
        }

        return arr;
    }
}
