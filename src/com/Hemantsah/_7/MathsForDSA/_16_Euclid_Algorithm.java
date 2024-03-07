package com.Hemantsah._7.MathsForDSA;

public class _16_Euclid_Algorithm {
    public static void main(String[] args) {
        int a=80;
        int b=45;
        System.out.println(gcd(a,b));
    }

    public static int gcd(int a, int b) {
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
