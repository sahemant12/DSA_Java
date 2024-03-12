package com.Hemantsah._5.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class _15_using_iterative_13_14_Ques {
    public static void main(String[] args) {
//        int[] arr={1,2,3};
//        ArrayList<ArrayList<Integer>> ans = subsetByIterative(arr);
//        for (ArrayList<Integer> list:ans){
//            System.out.println(list);
//        }
        int[] arr2={1,2,2};
        ArrayList<ArrayList<Integer>> ans = subsetByIterativeWithDuplicateElement(arr2);
        for (ArrayList<Integer> list:ans){
            System.out.println(list);
        }
    }
    private static ArrayList<ArrayList<Integer>> subsetByIterative(int[] arr) {
        ArrayList<ArrayList<Integer>>outer = new ArrayList<>();
        outer.add(new ArrayList<>());
//        System.out.println(outer.size()); //size=1
        for (int i:arr) {
            int n= outer.size(); //fixed the outer size otherwise it will go into the infinite loop
            for (int j = 0; j <n ; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j)); //create the copy of outer ArrayList element into inner ArrayList
                inner.add(i);
                outer.add(inner);
            }
        }
        return outer;
    }
    private static ArrayList<ArrayList<Integer>> subsetByIterativeWithDuplicateElement(int[] arr) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>>outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        for (int i=0; i<arr.length; i++) {
            if(i>0 && arr[i]==arr[i-1]){
                start+=i;
            }
            int n= outer.size();
            for (int j = start; j <n ; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
