package com.Hemantsah._5.Recursion;

public class _5_Array_Sorted_or_Not {
    public static void main(String[] args) {
        int[] arr={1,2,4,10,8,9,12};
        System.out.println(isSorted(arr,0));
    }
    private static boolean isSorted(int[] arr, int i) {
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<=arr[i+1]){
            return isSorted(arr,i+1);
        }
        return false;
    }
}
