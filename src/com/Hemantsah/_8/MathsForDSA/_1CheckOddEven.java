package com.Hemantsah._8.MathsForDSA;

public class _1CheckOddEven {
    public static void main(String[] args) {
        int num=1;
        System.out.println(isEven(num));
    }

    public static boolean isEven(int num) {
        return (num & 1)==0;
    }
}
