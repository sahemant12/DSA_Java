package com.Hemantsah._5.Recursion;


import java.util.Arrays;

public class _10_BubbleSort_Recursion {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,0,-2,999,1};
        System.out.println(Arrays.toString(BubbleSort_Recursion(arr,0,0)));
    }

    private static int[] BubbleSort_Recursion(int[] arr, int i, int j) {
        if(i==arr.length){
            return arr;
        }
        if(j<arr.length-1){
            if(arr[j]>arr[j+1]){
                //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                return BubbleSort_Recursion(arr,i,j+1);
            }else{
                return BubbleSort_Recursion(arr,i,j+1);
            }
        }else{
            return BubbleSort_Recursion(arr,i+1,0);
        }
    }
}
