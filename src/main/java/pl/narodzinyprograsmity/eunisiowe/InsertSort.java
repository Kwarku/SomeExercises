package pl.narodzinyprograsmity.eunisiowe;

import java.util.Arrays;

public class InsertSort {
    public static void insertionSort(int arr[]) {
        int element;
        int j;

        for (int i = 1; i < arr.length; i++) {
            element = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = element;
        }
    }

    public static void main(String[] args) {
        int[] array = {7, 3, 5, 1, 4, 2, 8, 9, 0};
        InsertSort.insertionSort(array);

        Arrays.stream(array).forEach(System.out::println);

    }
}
