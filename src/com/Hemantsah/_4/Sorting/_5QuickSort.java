package com.Hemantsah._4.Sorting;

import java.util.Arrays;

public class _5QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,100,20,80,55,60,50,70};
        QuickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void QuickSort(int[] arr, int s, int e) {
        if(s>e){
            return;
        }
        int i=s;
        int j=e;
        int pivot = arr[s+(e-s)/2];
        while(i<=j){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<=j){
                swap(arr,i,j);
                i++; j--;
            }
        }
        QuickSort(arr,s,j);
        QuickSort(arr,i,e);
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}