package com.Hemantsah._5.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _17_Leetcode_17 {
    public static void main(String[] args) {
//        pad("", "12");
//        System.out.println(padReturnArrayList("", "1"));
        System.out.println(letterCombinations("12"));
        System.out.println(letterCombinationsLeetcode("12"));

    }
    public static List<String> letterCombinationsLeetcode(String digits) {
        List<String>list = helperLeetCode("",digits);
        return list;
    }
    public static List<String> helperLeetCode(String p,String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        List<String> list = new ArrayList<>();
        for(int i=(digit-2)*3; i<(digit-1)*3; i++){
            char ch = (char)(i+'a');
            list.addAll(helperLeetCode(p+ch, up.substring(1)));
        }
        return list;
    }
    public static List<String> letterCombinations(String digits) {
        List<String>list = helper("",digits);
        return list;
    }
    public static List<String> helper(String p,String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        List<String> list = new ArrayList<>();
        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch = (char)(i+'a');
            list.addAll(helper(p+ch, up.substring(1)));
        }
        return list;
    }

        public static void pad(String p, String up){
            if(up.isEmpty()){
                System.out.println(p);
                return;
            }
            int digit = up.charAt(0)-'0';
//            System.out.println(digit);
            for(int i=(digit-1)*3; i<digit*3; i++){
                char ch = (char)(i+'a');
                pad(p+ch, up.substring(1));
            }
        }
    public static List<String> padReturnArrayList(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        List<String> list = new ArrayList<>();
        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch = (char)(i+'a');
            list.addAll(padReturnArrayList(p+ch, up.substring(1)));
        }
        return list;
    }
}
