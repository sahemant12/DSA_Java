package com.Hemantsah._7.MathsForDSA;

public class _6_apowerb {
    public static void main(String[] args) {
        int base=3;
        int power=5;
//        method1(base, power); //Time complexity: O(power)
        method2(base, power); //Time complexity: O(log(power))

    }

    public static void method2(int base, int power) {
        int ans=1;
        while(power>0){
            if((power & 1) ==1){
                ans*=base;
            }
            base*=base;
            power=power>>1;
        }
        System.out.println(ans);
    }

    public static void method1(int base, int power) {
        int ans=1;
        for (int i = 0; i <power ; i++) {
            ans*=base;
        }
        System.out.println(ans);
    }
}
