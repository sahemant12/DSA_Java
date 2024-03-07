package com.Hemantsah._5.Recursion;

import java.util.Arrays;

public class _11_SelectionSort_Recursion {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3,34,0,-1,12,34};
        SelectionSort_Recursion(arr,0,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void SelectionSort_Recursion(int[] arr, int i, int j,int max) {
        if(i==arr.length-1){
            return;
        }
        if(j<arr.length-1-i){
            if(arr[max]<arr[j+1]){
                max=j+1;
                 SelectionSort_Recursion(arr,i,j+1,max);
            }else{
                SelectionSort_Recursion(arr,i,j+1,max);
            }
        }else{
            //swap
            int temp = arr[max];
            arr[max]= arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
            SelectionSort_Recursion(arr,i+1,0,0);
        }
    }
}
