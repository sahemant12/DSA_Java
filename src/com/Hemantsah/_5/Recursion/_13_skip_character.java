package com.Hemantsah._5.Recursion;

public class _13_skip_character {
    public static void main(String[] args) {
        String str="applehello";
        String ans="";
//        System.out.println(SkipCharacter(str,ans)); //Approach1
//        System.out.println(SkipCharacter_approach2("baccad"));
        System.out.println(SkipApple(str));
//        System.out.println(SkipAppNotApple(str));

    }

    private static String SkipAppNotApple(String str) {
        if(str.isEmpty()){
            return "" ;
        }
        boolean app = str.startsWith("app") && !str.startsWith("apple");
        if(app){
            return SkipAppNotApple(str.substring(3));
        }else{
            return str.charAt(0) + SkipAppNotApple(str.substring(1));
        }
    }

    private static String SkipApple(String str) {
        if(str.isEmpty()){
            return "" ;
        }
        boolean apple = str.startsWith("apple");
        if(apple){
            return SkipApple(str.substring(5));
        }else{
            return str.charAt(0) + SkipApple(str.substring(1));
        }
    }

    private static String SkipCharacter_approach2(String str) { //Approach2
//        if(str.isEmpty()){
//            return "" ;
//        }
//        char ch = str.charAt(0);
//        if(ch=='a'){
//            return SkipCharacter_approach2(str.substring(1));
//        }else{
//            return ch + SkipCharacter_approach2(str.substring(1));
//        }

        //Another my approach
        if(str.isEmpty()){
            return "";
        }
        String ans  = SkipCharacter_approach2(str.substring(1));
        if(str.charAt(0)=='a'){
            return ans;
        }
        return str.charAt(0)+ans;
    }

    private static String SkipCharacter(String str, String ans) {
        if(str.isEmpty()){  //str.length()==0
            return ans;
        }
        if(str.charAt(0)=='a'){
            return SkipCharacter(str.substring(1),ans);
        }else{
            return SkipCharacter(str.substring(1),ans+str.charAt(0));
        }
    }
}
