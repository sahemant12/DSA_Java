package com.Hemantsah._4.Sorting;

import java.util.Arrays;

public class _1BubbleSort {
    public static void main(String[] args) {
    int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(BubbleSort(arr)));
    }
    public static int[] BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr[j],arr[j+1]);
                }
            }
        }
        return arr;
    }
    public static void swap(int i, int i1) {
        int temp=i;
        i=i1;
        i1=temp;
    }
}
