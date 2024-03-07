package com.Hemantsah._7.MathsForDSA;

public class _1CheckOddEven {
    public static void main(String[] args) {
        int num=1;
        System.out.println(isEven(num));
    }

    public static boolean isEven(int num) {
        return (num & 1)==0;
    }
}
