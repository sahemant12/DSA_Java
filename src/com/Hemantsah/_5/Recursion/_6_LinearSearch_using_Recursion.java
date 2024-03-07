package com.Hemantsah._5.Recursion;

public class _6_LinearSearch_using_Recursion {
    public static void main(String[] args) {
        int[] arr={1,2,4,10,8,9,12};
        int target=9;
        System.out.println(ls_recursion(arr,target,0));
    }

    private static int ls_recursion(int[] arr, int target, int i) {
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }else{
            return ls_recursion(arr,target,i+1);
        }
        //Another short way to write above code
//        return arr[i]==target || ls_recursion(arr,target,i+1); //work only for boolean
    }
}
