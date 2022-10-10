package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        System.out.print("Unsorted array: ");
        printArray(arr);
        System.out.println();

        for (int gap = arr.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < arr.length; i++) {
                int newElement = arr[i];
                int j = i;

                while (j >= gap && newElement < arr[j - gap]) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = newElement;
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
}
