package com.Hemantsah._2.Array_ArrayList;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
//        swap(arr,2,8);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr) {
        for(int i=0; i<arr.length/2; i++){
            swap(arr,i,arr.length-1-i);
        }
    }

    public static void swap(int[] arr, int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
    }
}
