package com.Hemantsah._5.Recursion;

public class _3_BsRecursion {
    public static void main(String[] args) {
        int[] arr = {1,5,7,8,9,10,45,67,99,105};
        int target = 9;
        System.out.println(BS(arr,target,0,arr.length-1));
    }

    private static int BS(int[] arr, int target,int s,int e) {
        if(s>e){
            return -1;
        }
        int mid=(s+(e-s)/2);
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            return BS(arr,target,s,mid-1);
        }else{
            return BS(arr,target,mid+1,e);
        }
    }
}
