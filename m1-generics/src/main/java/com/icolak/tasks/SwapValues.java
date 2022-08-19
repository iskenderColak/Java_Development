package com.icolak.tasks;

import java.util.Arrays;

public class SwapValues {

    public static void main(String[] args) {

        String[] arr = {"1", "2", "3", "4"};
        swapValue(arr, 0, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static <T> void swapValue(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
