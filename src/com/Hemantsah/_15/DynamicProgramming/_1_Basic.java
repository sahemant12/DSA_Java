package com.Hemantsah._15.DynamicProgramming;

import java.util.Arrays;

//1. It is used to give optimized soln of the prbms.
//2. Process: (i) Break down the complex prbm into simpler sub problem. (ii) Find optimal soln to these sub problems and stored them. (iii) reuse these stored sub problems result so that we don't have to calculate these sub problems again.  (iV). using these sub problems calculate the result of complex prbms.
public class _1_Basic {
    public static void main(String[] args) {
//        System.out.println(fiboUsingRecursion(42));  //TC: 0(2^n),  SC:0(n)

//        int n=43;
//        int[] dp = new int[n+1];
//        Arrays.fill(dp, -1);
//        System.out.println(fiboUsingMemoization(n, dp)); //TC: 0(n),  SC:0(n)
//
        System.out.println(fiboUsingTabulation(8)); //TC: 0(n),  SC:0(n)
    }

    private static int fiboUsingTabulation(int n) { //Bottom-up Approach
//        int[] dp = new int[n+1];
//        dp[0] = 0;
//        dp[1] = 1;
//        for(int i=2; i<=n; i++){
//            dp[i] = dp[i-1] + dp[i-2];
//        }
//        return dp[n];

        //space Optimation
        int prev2 = 0;
        int prev1 = 1;
        for(int i=2; i<=n; i++){
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    private static int fiboUsingMemoization(int n, int[] dp) { //Top-Down Approach
        if(n<=1){
            return n;
        }if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = fiboUsingMemoization(n-1, dp) + fiboUsingMemoization(n-2, dp);
    }

    private static int fiboUsingRecursion(int n) {
        if(n<=1){
            return n;
        }
        return fiboUsingRecursion(n-1) + fiboUsingRecursion(n-2);
    }
}
