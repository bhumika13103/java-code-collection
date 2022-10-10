package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        System.out.print("Unsorted array: ");
        printArray(arr);
        System.out.println();

        quickSort(arr, 0, arr.length);

        System.out.print("Sorted array: ");
        printArray(arr);
    }

    public static void quickSort(int[] input, int start, int end) {

        if(end - start < 2){
            return;
        }

        int pivotIndex = partition(input, start, end);

        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex+1, end);
    }

    public static int partition(int[] input, int start, int end) {
        int i = start;
        int j = end;
        int pivot = input[start];

        while(i<j){

            while(i<j && pivot<=input[--j]);
            if(i<j){
                input[i] = input[j];
                System.out.println("1st");
                printArray(input);
                System.out.println();
            }

            while(i<j && pivot>=input[++i]);
            if(i<j){
                input[j] = input[i];
                System.out.println("2nd");
                printArray(input);
                System.out.println();
            }

        }
        input[j] = pivot;
        System.out.println("final");
        printArray(input);
        System.out.println();
        return j;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
