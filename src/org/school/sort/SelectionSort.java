package org.school.sort;

public class SelectionSort {

    private static void sortArray(int[] arr) {
        int countOp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                countOp++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
        }

        System.out.println("Operation count: " + countOp);
        for (int anArr : arr) {
            System.out.print(anArr);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 4, 3, 2, 1};
        sortArray(arr);
    }
}
