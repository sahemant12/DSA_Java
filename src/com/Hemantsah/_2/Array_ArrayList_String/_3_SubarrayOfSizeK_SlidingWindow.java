package com.Hemantsah._2.Array_ArrayList_String;

import java.util.ArrayList;
import java.util.Arrays;

public class _3_SubarrayOfSizeK_SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {3,2,7,5,9,6,2};
        int k = 1;
        System.out.println((maxSumOfSubArrayOfSizeK(arr, k)));
    }

    private static ArrayList<Integer> maxSumOfSubArrayOfSizeK(int[] arr, int k) {
//        int maxSum = 0;
//        int j =k;
//        while(j>0){
//            maxSum+=arr[j-1];
//            j--;
//        }
//        int i=0;
//        while(i+k<arr.length){
//            int sum = maxSum - arr[i] + arr[i+k];
//            maxSum = Math.max(sum, maxSum);
//            i++;
//        }
//        return maxSum;

        //return index
        int maxSum = 0;
        int j =0;
        ArrayList<Integer> list = new ArrayList<>();
        while(j<k){
            maxSum+=arr[j];
            list.add(j);
            j++;
        }
        for(int i=k; i<arr.length; i++){
            int sum = maxSum - arr[i-k] + arr[i];
            if(sum>maxSum){
                maxSum = sum;
                for(int z=0; z<k; z++){
                    list.set(z,i-k+z+1);
                }
            }
        }
        return list;
    }
}
