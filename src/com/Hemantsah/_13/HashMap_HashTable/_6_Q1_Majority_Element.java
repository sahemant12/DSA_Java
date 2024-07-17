package com.Hemantsah._13.HashMap_HashTable;

import java.util.ArrayList;
import java.util.HashMap;

public class _6_Q1_Majority_Element {
    public static void main(String[] args) {
        int[] nums = {1,2};
        majorityElement(nums);
    }
    public static void majorityElement(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        //checking is ele>n/3
         for(int key: map.keySet()){
             if(map.get(key)>nums.length/3){
                 System.out.print(key+" ");
             }
         }
    }

}
