package com.Hemantsah._4.Sorting;

import java.util.Arrays;
import java.util.HashMap;

public class _6countSort {
    public static void main(String[] args) {
        int arr[] = {3,4,1,3,8,6,7,2,5,2,10};
//        int arr[] = {9,5,6,2,8,3,7,10,1,-1,0,-5,-10};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void countSort(int[] arr) {
//        int largestEle = getLargest(arr);
//        int[] count = new int[largestEle+1];
//        for(int i=0; i<arr.length; i++){
//            count[arr[i]] +=1;
//        }
//        int j=0;
//        for(int i=0; i<count.length; i++){
//            while(count[i]!=0){
//                arr[j++] = i;
//                count[i] -=1;
//            }
//        }

        //Using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
             int key = arr[i];
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key, 1);
            }
        }
        int j=0;
        for(int i:map.keySet()){
            int value = map.get(i);
            while(value!=0){
                arr[j++] = i;
                value--;
            }
        }
    }
    private static int getLargest(int[] arr){
        int lar = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        return lar;
    }
}
