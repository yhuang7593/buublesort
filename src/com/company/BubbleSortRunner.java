package com.company;

public class BubbleSortRunner {
    public static void main(String[] args)
    {
        int[] testArr={2,3,9,6,8};
        System.out.print("Before:");
        for(int num:testArr)
            System.out.print(num+"");
        System.out.println();
        BubbleSort.bubbleSort(testArr);
        System.out.print("After:");
        for(int num:testArr)
            System.out.print(num+"");
        System.out.println();
    }
}

