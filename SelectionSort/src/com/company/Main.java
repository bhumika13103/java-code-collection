package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.print("Unsorted array: ");
        printArray(arr);
        System.out.println();

        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastSortedIndex; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            swap(arr, largest, lastSortedIndex);
        }

        System.out.print("Sorted array: ");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
