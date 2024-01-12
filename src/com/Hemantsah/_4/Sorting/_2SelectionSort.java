package com.Hemantsah._4.Sorting;

import java.util.Arrays;

public class _2SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,4,1,3};
        System.out.println(Arrays.toString(SelectionSort(arr)));
    }

    public static int[] SelectionSort(int[] arr) {

        for (int i = 0; i <arr.length-1 ; i++) {
            int maxIndex = 0;
            for (int j = 1; j <arr.length-i ; j++) {
                if(arr[maxIndex]<arr[j]){
                    maxIndex=j;
                }
            }
            swap(arr,maxIndex,arr.length-1-i);
        }
        return arr;
    }
public static void swap(int[] arr, int maxIndex, int i){
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[i];
        arr[i]=temp;
}
}
