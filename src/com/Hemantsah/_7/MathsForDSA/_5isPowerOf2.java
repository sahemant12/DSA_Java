package com.Hemantsah._7.MathsForDSA;

public class _5isPowerOf2 {
    public static void main(String[] args) {
        int num=3;
            String ans = (num & (num-1))==0?"yes":"No";
        System.out.println(ans);
    }
}
