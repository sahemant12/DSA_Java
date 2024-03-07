package com.Hemantsah._5.Recursion;

import java.util.ArrayList;

//public class _7_ls_multiple_occurences { //passing list in parameter
//    public static void main(String[] args) {
//        int[] arr={1,2,4,10,8,9,12,8};
//        int target=8;
//        ArrayList<Integer>list = new ArrayList<>();
//        System.out.println(findAllIndex(arr,target,0,list));
//    }
//
//    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int i, ArrayList<Integer> list) {
//        if(i==arr.length){
//            return list;
//        }
//        if(arr[i]==target){
//            list.add(i);
//        }
//            return findAllIndex(arr,target,i+1,list);
//    }
//}


public class _7_ls_multiple_occurences { //not passing list in parameter
    public static void main(String[] args) {
        int[] arr={1,2,4,10,8,9,12,8};
        int target=8;
        System.out.println(findAllIndex(arr,target,0));
    }

    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int i) {
        ArrayList<Integer>list = new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
//        return findAllIndex(arr,target,i+1);
        ArrayList<Integer>ansFromBelowCalls = findAllIndex(arr,target,i+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
