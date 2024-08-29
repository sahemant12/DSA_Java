package com.Hemantsah._5.Recursion;

public class _19_StringIntoInt {
    public static void main(String[] args) {
//        System.out.println(convert("0145"));
        System.out.println(convertUsingRecursion("1234"));

    }
    public static int convert(String str){
        int ans = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int num = ch - '0';
            ans = ans*10 + num;
        }
        return ans;
    }
//    public static int convertUsingRecursion(String str){
//        int NoOfDigits = (int)(Math.log(Integer.parseInt(str))/Math.log(10)) + 1;
//        return helper(str, NoOfDigits);
//    }
    public static int convertUsingRecursion(String str){
        if(str.isEmpty()){
            return 0;
        }
        char ch = str.charAt(0);
        int chToNum = ch - '0';
        double ans = (chToNum * Math.pow(10, str.length()-1)) + convertUsingRecursion(str.substring(1));
        return (int)ans;
    }
}
