package com.Hemantsah._3.Searching;

public class _5_Rotated_BS_with_duplicates {
    public static void main(String[] args) {
//        int[] arr={10,12,15,15,2,4,5,7,8,9};
//        int target=15;
//        int[] arr={2,9,2,2,2,2,2};
//        int[] arr={2,2,2,2,2,6,2};
        int[] arr={2,2,5,5,6};



        int target=6;
        System.out.println(RBS(arr,target));
    }

    private static int RBS(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);

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
    private static int findPivotWithDuplicates(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(e>mid && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //if elements at middle, start, and end are equal then just skip the duplicates
            if(arr[mid] == arr[s] && arr[mid] == arr[e]){ //Note: Here, we are skipping the duplicates(if duplicates==pivot then return duplicates
                //skip the duplicates
                //NOTE: what if these elements at start and end were the pivot??
                //check if start is pivot
                if(arr[s]>arr[s+1]){ //start is pivot
                    return s;
                }
                s++;
                if(arr[e]<arr[e-1]){ //end-1 is pivot
                    return e-1;
                }
                e--;
            }
            //if pivot be in the right side
            else if(arr[s]<arr[mid] || arr[s] == arr[mid] && arr[mid]>arr[e]){
                s=mid+1;
            }else{ //else pivot is in the left side
                e=mid-1;
            }
        }
        return -1;
    }
}

