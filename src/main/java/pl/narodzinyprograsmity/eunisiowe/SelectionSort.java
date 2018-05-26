package pl.narodzinyprograsmity.eunisiowe;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int arr[]) {

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < arr.length; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }

            // Swap the found minimum element with the first
            // element
            swap(arr, i, min_idx);
        }
    }

    private static void swap(int[] arr, int i, int min_idx) {
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
    }


    public static void main(String[] args) {
        int[] tab = new int[3];
        int[] array = {5, 2, 3, 4, 1,6};
        SelectionSort.sort(array);
        Arrays.stream(array).forEach(System.out::println);
    }
}
