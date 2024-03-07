package com.Hemantsah._3.Searching;

public class _4_Rotated_BinarySearch {
    public static void main(String[] args) {
        int[] arr={10,12,15,15,2,4,5,7,8,9};
        int target=15;
        System.out.println(RBS(arr,target));
    }

    private static int RBS(int[] nums, int target) {
        int pivot = findPivot(nums);

        //If pivot not found then just do normal binary search
        if(pivot==-1){
            return BinarySearch(nums,target,0,nums.length-1);
        }

        if(nums[pivot]==target){
            return pivot;
        }

        if(target>=nums[0]){
            return BinarySearch(nums,target,0,pivot-1);
        }else{
            return BinarySearch(nums,target,pivot+1,nums.length-1);
        }
    }

    private static int BinarySearch(int[] arr, int target, int s, int e) {
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
    private static int findPivot(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(e>mid && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }else if(arr[s]>arr[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}
