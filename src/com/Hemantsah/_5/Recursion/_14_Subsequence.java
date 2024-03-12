package com.Hemantsah._5.Recursion;

import java.util.ArrayList;

public class _14_Subsequence {
    public static void main(String[] args) {
        subsequence("abc","");
//        System.out.println(subsequenceReturnArrayList("abc",""));
//        System.out.println(subsequenceAscii("abc",""));



//        ArrayList<Integer> arr= new ArrayList<>();
//        arr.add(1); arr.add(2); arr.add(3);
//        ArrayList<Integer> ans= new ArrayList<Integer>();
//        subsequencePassingArray(arr,ans);
//        System.out.println(arr);
//        System.out.println(ans);
    }

    private static ArrayList<String> subsequenceAscii(String str, String ans) {
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subsequenceAscii(str.substring(1),ans+ch);
        ArrayList<String> right = subsequenceAscii(str.substring(1),ans);
        ArrayList<String> middle = subsequenceAscii(str.substring(1),ans +(ch+0));
        left.addAll(right);
        left.addAll(middle);
        return left;
    }

    private static ArrayList<String> subsequenceReturnArrayList(String str, String ans) {
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = subsequenceReturnArrayList(str.substring(1),ans+ch);
        ArrayList<String> right = subsequenceReturnArrayList(str.substring(1),ans);
        left.addAll(right);
        return left;
    }

    private static void subsequence(String str, String ans) {
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        subsequence(str.substring(1),ans+str.charAt(0));
        subsequence(str.substring(1),ans);
    }
    private static void subsequencePassingArray(ArrayList<Integer> arr, ArrayList<Integer> ans) {
//        if(arr.isEmpty()){
//            System.out.println(ans);
//            return;
//        }
//        subsequencePassingArray(arr.remove(0),ans.add(arr.get(0)));
//        subsequencePassingArray(arr.remove(0),ans);
        return;

    }
}
