package com.Hemantsah._4.Sorting;

import java.util.Arrays;

public class _4MergeSort {
    public static void main(String[] args) {
        int[] arr = {56,11,36,67,89,100,0,-1,99,111};
        int s=0;
        int e=arr.length-1;
        MergeSortDivide(arr,s,e);
        System.out.println(Arrays.toString(arr));
    }

    public static void MergeSortDivide(int[] arr,int s,int e) {
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        MergeSortDivide(arr,s,mid);
        MergeSortDivide(arr,mid+1,e);
        MergeSortConquer(arr,s,mid,e);
    }

    public static void MergeSortConquer(int[] arr, int s, int mid, int e) {int i=s;
        int j=mid+1;
        int k=0;
        int[] temp= new int[e-s+1];
        while(i<=mid && j<=e){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid ) {
            temp[k++] = arr[i++];
        }
        while(j<=e ) {
            temp[k++] = arr[j++];
        }
        for(int t=0,b=s; t<temp.length; t++,b++){
            arr[b]=temp[t];
        }
    }
}
