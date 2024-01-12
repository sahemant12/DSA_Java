package com.Hemantsah._4.Sorting;

import java.util.Arrays;

public class _3InsertionSort {
    public static void main(String[] args) {
        int[] arr = {56,11,36,67,89,100,0,-1,99,111};
        System.out.println(Arrays.toString(InsertionSort(arr)));
    }

    public static int[] InsertionSort(int[] arr) {
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = arr.length-1-i; j >=0 ; j--) {
                int p=j+1;
                if(arr[p]<arr[j]){
                    swap(arr,p,j);
                }else{
                    break;
                }
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int p, int j){
        int temp=arr[p];
        arr[p]=arr[j];
        arr[j]=temp;
    }
}
