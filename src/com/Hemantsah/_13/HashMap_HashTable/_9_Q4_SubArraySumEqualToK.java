package com.Hemantsah._13.HashMap_HashTable;

import java.util.Arrays;

public class _9_Q4_SubArraySumEqualToK {
    public static void main(String[] args) {
//        extraPrefixSum();

    }
    public static void extraPrefixSum(){
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] prefix = new int[arr.length];
        prefix[0]=arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1] + arr[i];
        }
//        System.out.println(Arrays.toString(prefix));
        int count=0; int k=8;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(i-1<0 && arr[j]==k){
                    count++;
                }
                if(i>0 && arr[j]-arr[i-1]==k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
