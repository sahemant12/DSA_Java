package com.Hemantsah._4.Sorting;

import java.util.Arrays;


////1st Way
//public class _4MergeSort {
//    public static void main(String[] args) {
//        int[] arr = {56,11,36,67,89,100,0,-1,99,111};
//        int s=0;
//        int e=arr.length-1;
//        MergeSortDivide(arr,s,e);
//        System.out.println(Arrays.toString(arr));
//    }
//    public static void MergeSortDivide(int[] arr,int s,int e) {
//        if(s>=e){
//            return;
//        }
//        int mid=s+(e-s)/2;
//        MergeSortDivide(arr,s,mid);
//        MergeSortDivide(arr,mid+1,e);
//        MergeSortConquer(arr,s,mid,e);
//    }
//
//    public static void MergeSortConquer(int[] arr, int s, int mid, int e) {int i=s;
//        int j=mid+1;
//        int k=0;
//        int[] temp= new int[e-s+1];
//        while(i<=mid && j<=e){
//            if(arr[i]<=arr[j]){
//                temp[k++]=arr[i++];
//            }
//            else{
//                temp[k++]=arr[j++];
//            }
//        }
//        while(i<=mid ) {
//            temp[k++] = arr[i++];
//        }
//        while(j<=e ) {
//            temp[k++] = arr[j++];
//        }
//        for(int t=0,b=s; t<temp.length; t++,b++){
//            arr[b]=temp[t];
//        }
//    }
//}



//2nd Way
public class _4MergeSort {
    public static void main(String[] args) {
        int[] arr = {56, 11, 36, 67, 89, 100, 0, -1, 99, 111};
        arr = MergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] MergeSort(int[] arr) {
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = MergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = MergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }
    public static int[] merge(int[] left, int[] right){
        int i=0;
        int j=0;
        int k=0;
        int[] mix= new int[left.length + right.length];

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k++] = left[i++];
            }else{
                mix[k++] = right[j++];
            }
        }
        while(i<left.length){
            mix[k++] = left[i++];
        }
        while(j<right.length){
            mix[k++] = right[j++];
        }
        return mix;
    }
}