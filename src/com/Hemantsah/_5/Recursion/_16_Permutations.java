package com.Hemantsah._5.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class _16_Permutations {
    public static void main(String[] args) {
//        permutations("","abc");
//        System.out.println(permutationsReturnList("","abc"));
//        System.out.println(permutationsReturnCount("","abc"));
          System.out.println(permutationsReturnCountByPassingArgument("","abcd",0));

    }

    private static int permutationsReturnCountByPassingArgument(String p, String up,int count) {
        if(up.isEmpty()){
            count+=1;
            return count;
        }
        char ch = up.charAt(0);
        for (int i = 0; i < p.length()+1; i++) {
            String first = p.substring(0,i);
            int n = p.length();
            String second = p.substring(i,n);
            count = permutationsReturnCountByPassingArgument(first+ch+second,up.substring(1),count);
        }
        return count;
    }
    private static int permutationsReturnCount(String p, String up) {
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        char ch = up.charAt(0);
        for (int i = 0; i < p.length()+1; i++) {
            String first = p.substring(0,i);
            int n = p.length();
            String second = p.substring(i,n);
            count = count + permutationsReturnCount(first+ch+second,up.substring(1));
        }
        return count;
    }

    private static ArrayList<String> permutationsReturnList(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String>ans = new ArrayList<>();
        for (int i = 0; i < p.length()+1; i++) {
            String first = p.substring(0,i);
            int n = p.length();
            String second = p.substring(i,n);
            ans.addAll(permutationsReturnList(first+ch+second,up.substring(1)));
        }
        return ans;
    }

    private static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i < p.length()+1; i++) {
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutations(first+ch+second,up.substring(1));
        }
    }
}
