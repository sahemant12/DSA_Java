package com.Hemantsah._15.DynamicProgramming;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
        int n=45;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fibo2(n,dp));
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static int fibo2(int n, int[] dp){
        if(n==0 || n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = fibo2(n-1, dp) + fibo2(n-2, dp);
    }
}
