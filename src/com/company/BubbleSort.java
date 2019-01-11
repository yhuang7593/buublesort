package com.company;

public class BubbleSort {
    public static void bubbleSort(int[] Arr) {
        int temp;
        int j;
        for (j = 0; j < Arr.length - 1; j++) {
            for (int i = 0; i < Arr.length - 1; i++) {
                if (Arr[i] > Arr[i + 1]) {
                    temp = Arr[i + 1];
                    Arr[i + 1] = Arr[i];
                    Arr[i] = temp;
                }
            }
        }
    }
}