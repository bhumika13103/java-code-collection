package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.print("Unsorted array: ");
        printArray(arr);
        System.out.println();

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
	        /*lastUnsortedIndex will always decrease after each loop since the last element
            would be in it's right place so we won't have to loop through them again and again*/
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
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
