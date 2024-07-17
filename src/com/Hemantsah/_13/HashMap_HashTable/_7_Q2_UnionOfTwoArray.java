package com.Hemantsah._13.HashMap_HashTable;

import java.util.HashSet;

public class _7_Q2_UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {7,3,9};
        int[] arr2 = {6,3,9,2,9,4};
        System.out.println(unionTwoNum(arr1,arr2));
        System.out.println(intersectionTwoNum(arr1,arr2));

    }
    public static int unionTwoNum(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        return set.size();
    }
    public static int intersectionTwoNum(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet();
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        return count;
    }
}
