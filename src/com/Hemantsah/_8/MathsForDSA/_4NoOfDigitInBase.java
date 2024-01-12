package com.Hemantsah._8.MathsForDSA;

public class _4NoOfDigitInBase {
    public static void main(String[] args) {
        int n = 357906;
        int base=2;
        int ans = (int)((Math.log(n))/(Math.log(base))+1);
        System.out.println(ans);
    }
}
