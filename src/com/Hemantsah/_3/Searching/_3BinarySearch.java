package com.Hemantsah._3.Searching;

public class _3BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,11,40,50,100};
        int target = 100;
        System.out.println(binarySearch(arr,target));
    }

    public static int binarySearch(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;

        //Extra things: Order Agnostic Binary Search(check whether array is in asc or dsc order)
//        boolean isAsc = arr[e]>arr[s];
//        while(s<=e){
//            int mid = s+ (e-s)/2;
//            if(arr[mid]==target){
//                return mid;
//            }
//            if(isAsc){
//                if(arr[mid]>target){
//                    e=mid-1;
//                }else{
//                    s=mid+1;
//                }
//            }else{
//                if(arr[mid]>target){
//                    s=mid+1;
//                }else{
//                    e=mid-1;
//                }
//            }
//        }

        while(s<=e){
            int mid = s+ (e-s)/2;
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
}
