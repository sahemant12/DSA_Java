package com.Hemantsah._2.Array_ArrayList_String;

import java.util.Arrays;
import java.util.HashMap;

public class _1_TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,9,5,10,8,7};
        int target = 15;
        System.out.println(Arrays.toString(twoSum(arr, target))); //using Hashing
        System.out.println(isTwoSum(arr, target)); //using two pointer
    }

    private static boolean isTwoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int p1 = 0;
        int p2 = arr.length-1;
        while(p2>p1){
            if(arr[p1] + arr[p2] == target){
                return true;
            }else if(arr[p1] + arr[p2] > target){
                p2--;
            }else{
                p1++;
            }
        }
        return false;
    }

    private static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(arr[i], i);
        }
        return new int[] {-1, -1};
    }
}
